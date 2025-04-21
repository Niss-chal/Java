import java.util.Scanner;
class Division{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number divisioble by 5 and 11: ");
        int a=sc.nextInt();
        if((a/5==0) && (a/11==0)){
            System.out.println("Given number is divisible by both 5 and 11");
        }
        else{
            System.out.println("Given number is not divisible by 5 and 11");
        }
        sc.close();
    }
}