import java.util.LinkedList;
import java.util.Queue;

public class GraphOperations {

    private int[][] adjacencyMatrix;
    private int vertices;

    public GraphOperations(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    // Add a new vertex
    public void addVertex() {

        int newSize = vertices + 1;
        int[][] newMatrix = new int[newSize][newSize];

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                newMatrix[i][j] = adjacencyMatrix[i][j];
            }
        }

        adjacencyMatrix = newMatrix;
        vertices = newSize;

        System.out.println("Vertex " + (vertices - 1) + " added successfully.");
    }

    // Add an edge between two vertices
    public void addEdge(int source, int destination) {

        if (source < 0 || destination < 0 ||
                source >= vertices || destination >= vertices) {

            System.out.println("Invalid vertex.");
            return;
        }

        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;

        System.out.println(
                "Edge added between " + source + " and " + destination);
    }

    // Display the graph
    public void displayGraph() {

        System.out.println("Adjacency Matrix:");

        for (int i = 0; i < vertices; i++) {

            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Breadth First Search
    public void bfs(int startVertex) {

        if (startVertex < 0 || startVertex >= vertices) {
            System.out.println("Invalid start vertex.");
            return;
        }

        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int i = 0; i < vertices; i++) {

                if (adjacencyMatrix[currentVertex][i] == 1
                        && !visited[i]) {

                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        System.out.println();
    }

    // Depth First Search
    public void dfs(int startVertex) {

        if (startVertex < 0 || startVertex >= vertices) {
            System.out.println("Invalid start vertex.");
            return;
        }

        boolean[] visited = new boolean[vertices];

        System.out.print("DFS Traversal: ");

        dfsRecursive(startVertex, visited);

        System.out.println();
    }

    private void dfsRecursive(int vertex, boolean[] visited) {

        visited[vertex] = true;

        System.out.print(vertex + " ");

        for (int i = 0; i < vertices; i++) {

            if (adjacencyMatrix[vertex][i] == 1
                    && !visited[i]) {

                dfsRecursive(i, visited);
            }
        }
    }
}