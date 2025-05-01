import java.util.Scanner;

public class Countupperlower {
    public static void count(String a) {
        int low_count = 0;
        int up_count = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLowerCase(ch)) {
                low_count++;
            } else if (Character.isUpperCase(ch)) {
                up_count++;
            }
        }

        System.out.println("Uppercase is: " + up_count + " and Lowercase is: " + low_count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = sc.nextLine();
        count(input);
        sc.close();
    }
}
