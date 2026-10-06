public class QueueOperations {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueOperations(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
// Add a value to the queue
public void enqueue(int value) {
    if (size == queue.length) {
        System.out.println("Queue is full.");
        return;
    }

    rear = (rear + 1) % queue.length;
    queue[rear] = value;
    size++;

    System.out.println(value + " added to the queue.");
}// Remove a value from the queue
public int dequeue() {
    if (size == 0) {
        System.out.println("Queue is empty.");
        return -1;
    }

    int value = queue[front];
    front = (front + 1) % queue.length;
    size--;

    System.out.println(value + " removed from the queue.");
    return value;
}// View the front value of the queue
public int peek() {
    if (size == 0) {
        System.out.println("Queue is empty.");
        return -1;
    }

    return queue[front];
}// Display all values in the queue
public void display() {
    if (size == 0) {
        System.out.println("Queue is empty.");
        return;
    }

    System.out.print("Queue elements: ");

    for (int i = 0; i < size; i++) {
        int index = (front + i) % queue.length;
        System.out.print(queue[index] + " ");
    }

    System.out.println();
}}