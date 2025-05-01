import java.util.Scanner;
public class PalindromePrime {
    public static boolean palindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;            
        }
    
            return (temp==rev);
    }
    public static boolean prime(int n) {
        int count=0;
        for (int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
    
        return (count==2);
        
    }
    public static void palinprime(int n){
        if(palindrome(n) && prime(n)){
            System.out.println("Given number is both palindrome and prime");
        }
        else{
            System.out.println("Given number is not palindrome and prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter any number: ");
        int n= sc.nextInt();
        palinprime(n);
        sc.close();
    }
    
}
