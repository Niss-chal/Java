import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int rev=0;
        int i=0;
        while(n>0){
            i=n%10;
            rev=rev*10+i;
            n=n/10;
        }
        System.out.println("The reverse of the number is: "+rev);
    sc.close();
    }    
}
