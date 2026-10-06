import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=============================================");
            System.out.println(" DATA STRUCTURE & GRAPH ANALYZER");
            System.out.println("=============================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    arrayOperations();
                    break;

                case 2:
                    stackOperations();
                    break;

                case 3:
                    queueOperations();
                    break;

                case 4:
                    linkedListOperations();
                    break;

                case 5:
                    searchingOperations();
                    break;

                case 6:
                    graphOperations();
                    break;

                case 7:
                    performanceComparison();
                    break;

                case 8:
                    displayAllResults();
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 - 9.");
            }

        } while (choice != 9);

        scanner.close();
    }


    // ================= ARRAY =================

    public static void arrayOperations() {

        System.out.println("\n--- Array Operations ---");

        ArrayOperations array = new ArrayOperations(10);

        array.insert(10);
        array.insert(20);
        array.insert(30);

        array.display();

        int result = array.search(20);

        if (result != -1) {
            System.out.println("20 found at index: " + result);
        } else {
            System.out.println("20 not found.");
        }

        array.delete(20);
        array.display();
    }


    // ================= STACK =================

    public static void stackOperations() {

        System.out.println("\n--- Stack Operations ---");

        StackOperations stack = new StackOperations(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();

        stack.display();
    }


    // ================= QUEUE =================

    public static void queueOperations() {

        System.out.println("\n--- Queue Operations ---");

        QueueOperations queue = new QueueOperations(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Front element: " + queue.peek());

        queue.dequeue();

        queue.display();
    }


    // ============== LINKED LIST ==============

    public static void linkedListOperations() {

        System.out.println("\n--- Linked List Operations ---");

        LinkedListOperations list = new LinkedListOperations();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

        if (list.search(20)) {
            System.out.println("20 found in the linked list.");
        } else {
            System.out.println("20 not found in the linked list.");
        }

        list.delete(20);

        list.display();
    }


    // ================ SEARCHING ================

    public static void searchingOperations() {

        System.out.println("\n--- Searching Operations ---");

        SearchingOperations search = new SearchingOperations();

        int[] numbers = {10, 20, 30, 40, 50};

        int linearResult = search.linearSearch(numbers, 30);

        if (linearResult != -1) {
            System.out.println(
                    "Linear Search: 30 found at index " + linearResult);
        } else {
            System.out.println("Linear Search: 30 not found.");
        }

        int binaryResult = search.binarySearch(numbers, 40);

        if (binaryResult != -1) {
            System.out.println(
                    "Binary Search: 40 found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: 40 not found.");
        }


        // Sorting demonstration
        System.out.println("\n--- Sorting Operations ---");

        SortingOperations sorting = new SortingOperations();

        int[] bubbleNumbers = {50, 20, 40, 10, 30};

        sorting.bubbleSort(bubbleNumbers);

        System.out.print("Bubble Sort: ");

        for (int number : bubbleNumbers) {
            System.out.print(number + " ");
        }

        System.out.println();


        int[] selectionNumbers = {45, 15, 35, 5, 25};

        sorting.selectionSort(selectionNumbers);

        System.out.print("Selection Sort: ");

        for (int number : selectionNumbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }


    // ================= GRAPH =================

    public static void graphOperations() {

        System.out.println("\n--------------- GRAPH OPERATIONS ------------");

        GraphOperations graph = new GraphOperations(5);
        graph.addVertex();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.displayGraph();

        graph.bfs(0);

        graph.dfs(0);
    }


    // =========== PERFORMANCE COMPARISON ===========

    public static void performanceComparison() {

        System.out.println("\n=============================================");
        System.out.println(" PERFORMANCE COMPARISON");
        System.out.println("=============================================");

        PerformanceAnalyzer performance =
                new PerformanceAnalyzer();

        int[] numbers =
                {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("\nLinear Search Performance:");

        performance.linearSearchPerformance(numbers, 90);

        System.out.println("\nBinary Search Performance:");

        performance.binarySearchPerformance(numbers, 90);

        performance.displayComplexity();
    }


    // ============== DISPLAY ALL ==============

    public static void displayAllResults() {

        System.out.println("\n=============================================");
        System.out.println(" DISPLAY ALL RESULTS");
        System.out.println("=============================================");

        arrayOperations();

        stackOperations();

        queueOperations();

        linkedListOperations();

        searchingOperations();

        graphOperations();

        performanceComparison();
    }
}