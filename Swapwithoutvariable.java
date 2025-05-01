import java.util.Scanner;
public class Swapwithoutvariable {
    public static void swap(int a, int b){
        System.out.println("Before swapping a: "+a+" and b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a: "+a+" and b: "+b);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter any number: ");
        int a=sc.nextInt();
        System.out.println("Enter another number: ");
        int b=sc.nextInt();
        swap(a, b);
        sc.close();
    }
}
