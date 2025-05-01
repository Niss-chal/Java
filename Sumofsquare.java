import java.util.Scanner;
public class Sumofsquare {
    public static void calc(int n){
        int sum=0;
        int i=0;
        while(n>0){
            i=n%10;
            sum=sum+i*i;
            n=n/10;
        }
        System.out.println("Sum of square of digits is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        calc(n);
        sc.close();
    }
}
