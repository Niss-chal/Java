import java.util.Scanner;
public class Factors {
    public static void factor(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n= sc.nextInt();
        factor(n);
        sc.close();
    }
    
}
