import java.util.Scanner;

public class CallCenterQueue {
    private String[] calls;
    private int front, rear, size;

    public CallCenterQueue(int capacity) {
        calls = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCall(String caller) {
        if (size == calls.length) {
            System.out.println("Call queue is full!");
        } else {
            rear = (rear + 1) % calls.length;
            calls[rear] = caller;
            size++;
            System.out.println("Incoming call from " + caller + " added.");
        }
    }

    public void serveCall() {
        if (size == 0) {
            System.out.println("No calls to handle.");
        } else {
            System.out.println("Handling call from " + calls[front]);
            front = (front + 1) % calls.length;
            size--;
        }
    }

    public void displayCalls() {
        if (size == 0) {
            System.out.println("No pending calls.");
        } else {
            System.out.print("Pending calls: ");
            for (int i = 0; i < size; i++) {
                System.out.print(calls[(front + i) % calls.length] + " ");
            }
            System.out.println();
        }
    }

    public void displayCount() {
        System.out.println("Number of pending calls: " + size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenterQueue ccq = new CallCenterQueue(5);
        int choice;

        do {
            System.out.println("\n1. Add Call\n2. Serve Call\n3. Display Queue\n4. Pending Calls Count\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter caller name: ");
                    String caller = sc.nextLine();
                    ccq.addCall(caller);
                    break;
                case 2:
                    ccq.serveCall();
                    break;
                case 3:
                    ccq.displayCalls();
                    break;
                case 4:
                    ccq.displayCount();
                    break;
                case 5:
                    System.out.println("System exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 5);

        sc.close();
    }
}
