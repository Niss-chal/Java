import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("Enter the switch number: ");
        int operator=sc.nextInt();
        switch (operator) {
            case 1:
                int sum=a+b;
                System.out.println("The sum of "+a+" and "+b+" is: "+sum);                
                break;
            case 2:
                int diff=a-b;
                System.out.println("The difference of "+a+" and "+b+" is: "+diff);                
                break;
            case 3:
                int prod=a*b;
                System.out.println("The product of "+a+" and "+b+" is: "+prod);                
                break;
            case 4:
                int div=a/b;
                System.out.println("The division of "+a+" and "+b+" is: "+div);                
                break;            
            default:
                System.out.println("Invalid operator. Please enter a number between 1 and 4.");
                break;
        }
        sc.close();    
    
    }
}