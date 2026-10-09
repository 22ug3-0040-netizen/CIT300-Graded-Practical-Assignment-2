public class StackOperations {

    private int[] stack;
    private int top;

    public StackOperations(int capacity) {
    if (capacity < 0) {
        throw new IllegalArgumentException(
            "Stack capacity cannot be negative."
        );
    }

    stack = new int[capacity];
    top = -1;
}
// Push a value onto the stack
public void push(int value) {
    if (top == stack.length - 1) {
        System.out.println("Stack is full.");
        return;
    }

    top++;
    stack[top] = value;
    System.out.println(value + " pushed successfully.");
}// Pop the top value from the stack
public int pop() {
    if (top == -1) {
        System.out.println("Stack is empty.");
        return -1;
    }

    int value = stack[top];
    top--;
    System.out.println(value + " popped successfully.");
    return value;
}// Peek at the top value
public int peek() {
    if (top == -1) {
        System.out.println("Stack is empty.");
        return -1;
    }

    return stack[top];
}// Display all values in the stack
public void display() {
    if (top == -1) {
        System.out.println("Stack is empty.");
        return;
    }

    System.out.print("Stack elements: ");
    for (int i = top; i >= 0; i--) {
        System.out.print(stack[i] + " ");
    }
    System.out.println();
}}
