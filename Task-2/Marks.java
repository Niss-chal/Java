import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter the marks of first subject: ");   
        float a =sc.nextInt();

        System.out.println("Enter the marks of second subject: ");
        float b =sc.nextInt();

        System.out.println("Enter the marks of third subject: ");
        float c =sc.nextInt();

        System.out.println("Enter the marks of fouth subject: ");
        float d =sc.nextInt();

        System.out.println("Enter the marks of fifth subject: ");
        float e=sc.nextInt();
        float total=a+b+c+d+e;
        System.out.println("Your total marks is: "+total);
        float per=(total/500)*100;
        System.out.println("Your percentage is: "+per);
        if(per>=70 && per <=100){
            System.out.println("You have gained first class");
        }
        else if(per>=60 && per<70){
            System.out.println("You have gained upper second class");
        }
        else if(per>=50 && per<60){
            System.out.println("You have gained lower second class");
        }
        else if(per>=40 && per<50){
            System.out.println("You have third class");
        }
        else{
            System.out.println("Failed");
        }
        sc.close();
    }
    
}
