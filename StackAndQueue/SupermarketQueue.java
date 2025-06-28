import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front, rear, size;

    public SupermarketQueue(int capacity) {
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCustomer(String name) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = name;
            size++;
            System.out.println(name + " added to queue.");
        }
    }

    public void serveCustomer() {
        if (size == 0) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println(queue[front] + " has been served.");
            front = (front + 1) % queue.length;
            size--;
        }
    }

    public void displayQueue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % queue.length] + " ");
            }
            System.out.println();
        }
    }

    public void displayCount() {
        System.out.println("Number of customers in queue: " + size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SupermarketQueue q = new SupermarketQueue(5);
        int choice;

        do {
            System.out.println("\n1. Add Customer\n2. Serve Customer\n3. Display Queue\n4. Display Count\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    q.addCustomer(name);
                    break;
                case 2:
                    q.serveCustomer();
                    break;
                case 3:
                    q.displayQueue();
                    break;
                case 4:
                    q.displayCount();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 5);

        sc.close();
    }
}
