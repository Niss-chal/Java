public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = element;
            System.out.println(element + " pushed to stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element is: " + s.peek());
        System.out.println("Size of stack: " + s.size());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Is stack empty? " + s.isEmpty());
    }
}

