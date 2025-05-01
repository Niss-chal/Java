import java.util.Scanner;
public class Cube {
    public static void cube(int b){
        double result=Math.pow(b,3);
        System.out.println("Cube of "+b+" is " +result);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int b=sc.nextInt();
        cube(b);
        sc.close();
    }
}
