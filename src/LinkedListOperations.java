public class LinkedListOperations {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedListOperations() {
        head = null;
    }
// Insert a value into the linked list
public void insert(int value) {
    Node newNode = new Node(value);

    if (head == null) {
        head = newNode;
    } else {
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    System.out.println(value + " inserted into the linked list.");
}
// Delete a value from the linked list
public void delete(int value) {
    if (head == null) {
        System.out.println("Linked list is empty.");
        return;
    }

    if (head.data == value) {
        head = head.next;
        System.out.println(value + " deleted from the linked list.");
        return;
    }

    Node current = head;

    while (current.next != null && current.next.data != value) {
        current = current.next;
    }

    if (current.next == null) {
        System.out.println(value + " not found in the linked list.");
    } else {
        current.next = current.next.next;
        System.out.println(value + " deleted from the linked list.");
    }
}// Search for a value in the linked list
public boolean search(int value) {
    Node current = head;

    while (current != null) {
        if (current.data == value) {
            return true;
        }
        current = current.next;
    }

    return false;
}// Display all values in the linked list
public void display() {
    if (head == null) {
        System.out.println("Linked list is empty.");
        return;
    }

    System.out.print("Linked list elements: ");

    Node current = head;

    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }

    System.out.println();
}}