import java.util.Scanner;
public class Positivenegativezero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        if(a>0){
            System.out.printf("%s is positive",a);
        }
        else if(a<0){
            System.out.printf("%s is negative",a);
        }
        else{
            System.out.printf("%s is zero",a);
        }
        sc.close();

    }
    
}
