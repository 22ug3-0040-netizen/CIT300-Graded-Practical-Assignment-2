import java.util.*;
public class Main {
  private static final Scanner sc = new Scanner(System.in);
  private static final ArrayOperations array = new ArrayOperations(10);
  private static final StackOperations stack = new StackOperations(10);
  private static final QueueOperations queue = new QueueOperations(10);
  private static final LinkedListOperations linked = new LinkedListOperations();
  private static final SearchingOperations searching = new SearchingOperations();
  private static final GraphOperations graph = new GraphOperations(5);
  private static int number(String prompt) {
    while (true) {
      System.out.print(prompt);
      String line = sc.nextLine().trim();
      try { return Integer.parseInt(line); }
      catch (NumberFormatException e) { System.out.println("Invalid input. Enter a whole number."); }
    }
  }
  private static void menu(String title, String... options) {
    System.out.println("\n===== " + title + " =====");
    for (int i=0; i<options.length; i++) System.out.println((i+1) + ". " + options[i]);
  }
  public static void main(String[] args) {
    while (true) {
      menu("DATA STRUCTURE & GRAPH ANALYZER", "Array Operations", "Stack Operations", "Queue Operations", "Linked List Operations", "Searching Operations", "Graph Operations", "Performance Comparison", "Display All Results", "Exit");
      int c=number("Enter your choice: ");
      switch(c) {
        case 1: arrayOperations(); break;
        case 2: stackOperations(); break;
        case 3: queueOperations(); break;
        case 4: linkedListOperations(); break;
        case 5: searchingOperations(); break;
        case 6: graphOperations(); break;
        case 7: performanceComparison(); break;
        case 8: displayAllResults(); break;
        case 9: System.out.println("Thank you for using the system."); return;
        default: System.out.println("Invalid choice. Select 1 - 9.");
      }
    }
  }
  public static void arrayOperations() {
    while(true) {
      menu("ARRAY OPERATIONS", "Insert Element", "Delete Element", "Search Element", "Display Array", "Back to Main Menu");
      switch(number("Enter your choice: ")) {
        case 1: array.insert(number("Enter value to insert: ")); break;
        case 2: array.delete(number("Enter value to delete: ")); break;
        case 3: { int v=number("Enter value to search: "); int i=array.search(v); System.out.println(i<0 ? "Value not found." : v+" found at index: "+i); break; }
        case 4: array.display(); break;
        case 5: return;
        default: System.out.println("Invalid choice. Select 1 - 5.");
      }
    }
  }
  public static void stackOperations() {
    while(true) {
      menu("STACK OPERATIONS", "Push Element", "Pop Element", "Peek Top Element", "Display Stack", "Back to Main Menu");
      switch(number("Enter your choice: ")) {
        case 1: stack.push(number("Enter value to push: ")); break;
        case 2: stack.pop(); break;
        case 3: { int v=stack.peek(); if(v!=-1) System.out.println("Top element: "+v); break; }
        case 4: stack.display(); break;
        case 5: return;
        default: System.out.println("Invalid choice. Select 1 - 5.");
      }
    }
  }
  public static void queueOperations() {
    while(true) {
      menu("QUEUE OPERATIONS", "Enqueue Element", "Dequeue Element", "Peek Front Element", "Display Queue", "Back to Main Menu");
      switch(number("Enter your choice: ")) {
        case 1: queue.enqueue(number("Enter value to enqueue: ")); break;
        case 2: queue.dequeue(); break;
        case 3: { int v=queue.peek(); if(v!=-1) System.out.println("Front element: "+v); break; }
        case 4: queue.display(); break;
        case 5: return;
        default: System.out.println("Invalid choice. Select 1 - 5.");
      }
    }
  }
  public static void linkedListOperations() {
    while(true) {
      menu("LINKED LIST OPERATIONS", "Insert Element", "Delete Element", "Search Element", "Display Linked List", "Back to Main Menu");
      switch(number("Enter your choice: ")) {
        case 1: linked.insert(number("Enter value to insert: ")); break;
        case 2: linked.delete(number("Enter value to delete: ")); break;
        case 3: { int v=number("Enter value to search: "); System.out.println(v+(linked.search(v)?" found":" not found")+" in the linked list."); break; }
        case 4: linked.display(); break;
        case 5: return;
        default: System.out.println("Invalid choice. Select 1 - 5.");
      }
    }
  }
  private static int[] readArray() {
    int n=number("How many numbers (1-1000)? ");
    if(n<1 || n>1000) { System.out.println("Invalid size."); return null; }
    int[] a=new int[n];
    for(int i=0;i<n;i++) a[i]=number("Number "+(i+1)+": ");
    return a;
  }
  public static void searchingOperations() {
    while(true) {
      menu("SEARCHING OPERATIONS", "Linear Search", "Binary Search (sorted)", "Bubble Sort", "Selection Sort", "Back to Main Menu");
      int c=number("Enter your choice: ");
      if(c==5) return;
      if(c<1 || c>4) { System.out.println("Invalid choice."); continue; }
      int[] a=readArray(); if(a==null) continue;
      if(c==1 || c==2) {
        if(c==2) { Arrays.sort(a); System.out.println("Sorted array: "+Arrays.toString(a)); }
        int target=number("Enter value to search: ");
        int index=c==1 ? searching.linearSearch(a,target) : searching.binarySearch(a,target);
        System.out.println(index<0 ? "Value not found." : "Found at index: "+index);
      } else {
        SortingOperations sort=new SortingOperations();
        if(c==3) sort.bubbleSort(a); else sort.selectionSort(a);
        System.out.println("Sorted array: "+Arrays.toString(a));
      }
    }
  }
  public static void graphOperations() {
    while(true) {
      menu("GRAPH OPERATIONS", "Add Vertex", "Add Edge", "Display Adjacency Matrix", "BFS Traversal", "DFS Traversal", "Back to Main Menu");
      switch(number("Enter your choice: ")) {
        case 1: graph.addVertex(); break;
        case 2: graph.addEdge(number("Source vertex: "),number("Destination vertex: ")); break;
        case 3: graph.displayGraph(); break;
        case 4: graph.bfs(number("Start vertex: ")); break;
        case 5: graph.dfs(number("Start vertex: ")); break;
        case 6: return;
        default: System.out.println("Invalid choice. Select 1 - 6.");
      }
    }
  }
  public static void performanceComparison() {
    PerformanceAnalyzer p=new PerformanceAnalyzer();
    int[] a=new int[1000]; for(int i=0;i<a.length;i++) a[i]=i;
    System.out.println("\nPerformance comparison using 1000 sorted elements:");
    p.linearSearchPerformance(a,900);
    p.binarySearchPerformance(a,900);
    p.displayComplexity();
  }
  public static void displayAllResults() {
    System.out.println("\n===== CURRENT DATA STRUCTURES =====");
    System.out.println("Array:"); array.display();
    System.out.println("Stack:"); stack.display();
    System.out.println("Queue:"); queue.display();
    System.out.println("Linked List:"); linked.display();
    System.out.println("Graph:"); graph.displayGraph();
    System.out.println("Performance analysis: select option 7 in Main Menu.");
  }
}