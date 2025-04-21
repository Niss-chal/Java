import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        int sum=a+b;
        int diff=a-b;
        int product=a*b;
        float quotient=a/b;
        System.out.println("Sum is: "+sum);
        System.out.println("Difference is: "+diff);
        System.out.println("Product is: "+product);
        System.out.println("Quotient is: "+quotient);
        sc.close();

    }
    
}
