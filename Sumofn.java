import java.util.Scanner;
public class Sumofn {
    public static int sum(int n){
        int sum=0;
        for (int i=1; i<=n; i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n= sc.nextInt();
        System.out.println("Sum of first "+n+" number is: "+sum(n));;
        sc.close();
    }  
}
