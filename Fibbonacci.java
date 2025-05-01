import java.util.Scanner;
public class Fibbonacci {
    public static void generate(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        generate(n);
        sc.close();
    }
}