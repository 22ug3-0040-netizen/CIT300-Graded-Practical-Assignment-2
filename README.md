
# Data Structure and Graph Performance Analyzer

## CIT300 - Data Structures and Algorithms
### Graded Practical Assignment 2

---

## Project Description

The Data Structure and Graph Performance Analyzer is a Java-based console application developed to demonstrate the practical implementation of fundamental data structures and algorithms.

The system includes Array, Stack, Queue, Linked List, Searching, Sorting, Graph Operations, Graph Traversals, and Performance Comparison. All components are integrated into a console-based main menu.
The application provides interactive submenus that allow users to enter their own values and perform data structure and algorithm operations through the console.
---

## Team Members

| No. | Student Name | Student ID | Assigned Responsibility |
|---|---|---|---|
| 1 | Rashindi Hashara | 22UG3-0422 | Array and Searching |
| 2 | Sudeshika Herath | 22UG3-0040 | Stack and Queue |
| 3 | Schini Pramudika | 22UG3-0080 | Linked List |
| 4 | Janith Isanka | 22UG3-0134 | Graph, Performance Comparison, Main Menu Integration and Testing |

---

## Individual Contributions

### Member 1 - Rashindi Hashara
**Student ID:** 22UG3-0422

**Responsibility:** Array and Searching

**Contribution:**
- Implemented Array operations.
- Implemented Insert operation.
- Implemented Delete operation.
- Implemented Search operation.
- Implemented Display operation.
- Implemented Linear Search.
- Implemented Binary Search.
- Tested Array and Searching operations.

---

### Member 2 - Sudeshika Herath
**Student ID:** 22UG3-0040

**Responsibility:** Stack and Queue

**Contribution:**
- Implemented Stack operations.
- Implemented Push operation.
- Implemented Pop operation.
- Implemented Peek operation.
- Implemented Stack Display operation.
- Implemented Queue operations.
- Implemented Enqueue operation.
- Implemented Dequeue operation.
- Implemented Peek/Front operation.
- Implemented Queue Display operation.
- Tested Stack and Queue operations.

---

### Member 3 - Schini Pramudika
**Student ID:** 22UG3-0080

**Responsibility:** Linked List

**Contribution:**
- Implemented Singly Linked List.
- Implemented Insert operation.
- Implemented Delete operation.
- Implemented Search operation.
- Implemented Display operation.
- Tested Linked List operations.

---

### Member 4 - Janith Isanka
**Student ID:** 22UG3-0134

**Responsibility:** Graph, Performance Comparison, Main Menu Integration and Testing

**Contribution:**
- Implemented Graph using an adjacency matrix.
- Implemented Add Vertex operation.
- Implemented Add Edge operation.
- Implemented Graph Display operation.
- Implemented Breadth First Search (BFS).
- Implemented Depth First Search (DFS).
- Implemented Performance Comparison.
- Integrated the components into the main console menu.
- Performed integration and system testing.

---

## Main System Features

### 1. Array Operations
- Insert
- Delete
- Search
- Display

### 2. Stack Operations
- Push
- Pop
- Peek
- Display

### 3. Queue Operations
- Enqueue
- Dequeue
- Peek/Front
- Display

### 4. Linked List Operations
- Insert
- Delete
- Search
- Display

### 5. Searching Operations
- Linear Search
- Binary Search

### 6. Sorting Operations
- Bubble Sort
- Selection Sort

### 7. Graph Operations
- Add Vertex
- Add Edge
- Display Graph
- Breadth First Search (BFS)
- Depth First Search (DFS)

### 8. Performance Comparison
- Linear Search result
- Linear Search steps
- Linear Search execution time
- Binary Search result
- Binary Search steps
- Binary Search execution time
- Complexity information

### 9. Display All Results
The system can display the results of the implemented operations together.

### 10. Exit
The user can safely exit the application using the Exit option.

---

## Algorithm Complexity

| Algorithm | Time Complexity |
|---|---|
| Linear Search | O(n) |
| Binary Search | O(log n) |
| Bubble Sort | O(n^2) |
| Selection Sort | O(n^2) |
| BFS Traversal | O(V + E) |
| DFS Traversal | O(V + E) |

---

## Technologies Used

- Java
- Java Development Kit (JDK)
- Visual Studio Code
- Windows PowerShell
- Git
- GitHub

---

## Project Structure

The project contains the following main Java files:

- `Main.java`
- `ArrayOperations.java`
- `StackOperations.java`
- `QueueOperations.java`
- `LinkedListOperations.java`
- `SearchingOperations.java`
- `SortingOperations.java`
- `GraphOperations.java`
- `PerformanceAnalyzer.java`

---

## How to Run the Program

### Step 1

Open the project using Visual Studio Code.

### Step 2

Open the terminal and navigate to the `src` directory.

```text
cd src
```

### Step 3

Compile all Java files.

```text
javac *.java
```

### Step 4

Run the application.

```text
java Main
```
### Alternative Run Command (Low Memory)

If the computer has limited memory, run the application using:

```text
java -Xms16m -Xmx128m Main
```
---

## Main Menu

After running the program, the following main menu is displayed:

```text
=============================================
 DATA STRUCTURE & GRAPH ANALYZER
=============================================
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
```

The user can select an operation by entering the corresponding menu number.

---

## Performance Demonstration

The application demonstrates the performance of searching algorithms using:

- Search result index
- Number of search steps
- Execution time in nanoseconds
- Time complexity information

The application also displays the complexity of sorting and graph traversal algorithms.

### Complexity Summary

- Linear Search: `O(n)`
- Binary Search: `O(log n)`
- Bubble Sort: `O(n^2)`
- Selection Sort: `O(n^2)`
- BFS Traversal: `O(V + E)`
- DFS Traversal: `O(V + E)`

---

## Testing

The implemented components were compiled and tested using the Java compiler and Visual Studio Code terminal.

The project was compiled using:

```text
javac *.java
```

The application was executed using:

```text
java Main
```

The main menu options and individual data structure operations were tested to verify that the system works correctly.
The interactive Array, Stack, Queue, Linked List, Searching, Sorting, Graph, Performance Comparison, and Display All Results features were tested through the console menu.
---

## Conclusion

The Data Structure and Graph Performance Analyzer demonstrates the practical implementation of fundamental data structures and algorithms using Java.

The project combines Array, Stack, Queue, Linked List, Searching, Sorting, Graph Traversal, and Performance Comparison into a single console-based application.

The system also demonstrates differences in algorithm efficiency through execution steps, execution time, and Big-O complexity.