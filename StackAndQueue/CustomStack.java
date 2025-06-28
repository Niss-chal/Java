public class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            stack[++top] = val;
            System.out.println(val + " pushed.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
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

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        CustomStack cs = new CustomStack(3);
        cs.push(5);
        cs.push(15);
        cs.push(25);
        System.out.println("Top: " + cs.peek());
        System.out.println("Popped: " + cs.pop());
        System.out.println("Is empty? " + cs.isEmpty());
        System.out.println("Is full? " + cs.isFull());
    }
}
