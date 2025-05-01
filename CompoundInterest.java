import java.util.Scanner;
public class CompoundInterest {
    public static void calculate(double principal, double rate, double time){
        double amount=principal*Math.pow((1+(rate/100)),time);
        double ci=amount-principal;
        System.out.println("The Compound Interest is: "+ci);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal=sc.nextDouble();

        System.out.println("Enter the rate: ");
        double rate = sc.nextDouble();

        System.out.println("Enter the time: ");
        double time=sc.nextDouble();

        calculate(principal, rate, time);
        sc.close();
    }
    
}
