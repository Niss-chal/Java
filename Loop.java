// public class Loop {
//     public static void main(String[] args) {
//         for (int i=0; i<=100; i++){
//             System.out.println(i);
//         }
//     }
    
// }


// public class Loop{
//     public static void main(String[] args) {
//         for (int a=1; a<11; a++){
//             for (int b=0; a>=b; b++){
//                 System.out.println(b);
//             }

//         }
//     }  
// }

// public class Loop{
//     public static void main(String[] args) {
//         for (int a=1; a<=10; a++){
//             System.out.println("\n");
//             for (int i=1; i<=10; i++){
//                 System.out.println(a+"*"+i+"="+(a*i));
                
//             }
//         } 
//     }
// }

// import java.util.Scanner;
// public class Loop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Enter any number: ");
//         int a=sc.nextInt();
//         int sum=0;
//         for (int i=1; i<=a; i++)
//         {
//             sum=sum+i;
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }


// public class Loop{
//     public static void main(String[] args) {
//         for(int i=1; i<=100; i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

import java.util.Scanner;
public class Loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any character: ");
        String a=sc.next();
        sc.close();  
        int b=a.length();
        String reverse="";
        for ( int i=b-1; i>=0; i--){
            reverse+=a.charAt(i);
        }
        System.out.println(reverse);
  
    }
}