import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp=n;
        int rev=0;
        int i=0;
        while (n > 0) {
            i = n % 10; 
            rev = rev * 10 + i; 
            n = n / 10; 
        }
        if (temp == rev) {
            System.out.println("The number "+temp+" is a palindrome.");
        } else {
            System.out.println("The number is"+temp+" not a palindrome.");
        }       
        sc.close();
    }
    
}
