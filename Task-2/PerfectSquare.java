import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean perfect = false;
        
        for (int i = 0; i <= n; i++) {
            if (i * i == n) {
                perfect = true;
                break;
            }
        }
        
        if (perfect) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
        
        sc.close();
    }
    
}
