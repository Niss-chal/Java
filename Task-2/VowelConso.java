import java.util.Scanner;
public class VowelConso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char a=sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            System.out.println("Given alphabet is vowel");
        }
        else{
            System.out.println("Giveb alphabet is consonant");
        }
        sc.close();
    }
    
}
