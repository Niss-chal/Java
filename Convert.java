import java.util.Scanner;
public class Convert {
    public static void yearsdays(int days){
        int years=days/365;
        days=days%365;
        int months=days/30;
        days=days%30;
        System.out.println(years+" years "+months+" months and "+days+" days");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of days: ");
        int days= sc.nextInt();
        yearsdays(days);
        sc.close();
    }
    
}
