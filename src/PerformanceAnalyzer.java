public class PerformanceAnalyzer {

    // Linear Search Performance
    public void linearSearchPerformance(int[] array, int target) {
        int steps = 0;
        long startTime = System.nanoTime();

        int result = -1;

        for (int i = 0; i < array.length; i++) {
            steps++;

            if (array[i] == target) {
                result = i;
                break;
            }
        }

        long endTime = System.nanoTime();

        System.out.println("Linear Search Result Index: " + result);
        System.out.println("Linear Search Steps: " + steps);
        System.out.println("Linear Search Time: " + (endTime - startTime) + " ns");
    }

    // Binary Search Performance
    public void binarySearchPerformance(int[] array, int target) {
        int steps = 0;
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        long startTime = System.nanoTime();

        while (left <= right) {
            steps++;

            int middle = (left + right) / 2;

            if (array[middle] == target) {
                result = middle;
                break;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        long endTime = System.nanoTime();

        System.out.println("Binary Search Result Index: " + result);
        System.out.println("Binary Search Steps: " + steps);
        System.out.println("Binary Search Time: " + (endTime - startTime) + " ns");
    }

    // Display Complexity Information
    public void displayComplexity() {
        System.out.println("\n--- Complexity Information ---");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n)");
        System.out.println("Bubble Sort: O(n^2)");
        System.out.println("Selection Sort: O(n^2)");
        System.out.println("BFS Traversal: O(V + E)");
        System.out.println("DFS Traversal: O(V + E)");
    }
}