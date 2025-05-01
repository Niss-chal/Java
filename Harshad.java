import java.util.Scanner;
public class Harshad {
    public static void checkHarshadNumber(int n) {
        int sum = 0;
        int temp = n;

        while (n > 0) {
            sum = sum + n % 10;
            n = n/10;
        }
        if (temp % sum == 0) {
            System.out.println(temp + " is a Harshad number.");
        } else {
            System.out.println(temp + " is not a Harshad number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        checkHarshadNumber(n);
        sc.close();
    }
}
