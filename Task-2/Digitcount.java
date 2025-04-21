import java.util.Scanner;
public class Digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println("Number of digits: " + count); 
        sc.close();
    }
    
}
