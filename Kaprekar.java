import java.util.Scanner;
public class Kaprekar {

    public static boolean isKaprekar(int num) {
        if (num == 1) return true;

        int square = num * num;
        int count = 0;
        int temp = square;

        while (temp > 0) {
            count++;
            temp = temp/10;
        }

        for (int i = 1; i < count; i++) {
            int divisor = (int)Math.pow(10, i);

            int right = square % divisor;
            int left = square / divisor;

            if (right == 0) continue;

            if (left + right == num) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isKaprekar(number)) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is not a Kaprekar number.");
        }
        sc.close();
    }
}


