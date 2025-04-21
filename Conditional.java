// import java.util.Scanner;
// public class Conditional {
//     public static void main(String[] args) {
    //     int age =21;
    // if (age>=18)
    // {
    //     System.out.println("You can vote"); 
    // }
    // else
    // {
    //     System.out.println("You cannot vote");
    // }
    

    // if(age>=21)
    // {
    //     System.out.println("You are 21 and over");
    // }
    // else if (age>=18)
    // {
    //     System.out.println("You are 18 and over but not 21");
    // }
    // else
    // {
    //     System.out.println("You are smaller than 18");
    // }
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the first number: ");
    //     int a = sc.nextInt();

    //     System.out.println("Enter the second number: ");
    //     int b =sc.nextInt();

    //     System.out.println("Enter the third number: ");
    //     int c = sc.nextInt();
    
    //         if (a > b) {
    //             if (a > c) {
    //                 System.out.println(a + " is the highest number");
    //             } else {
    //                 System.out.println(c + " is the highest number");
    //             }
    //         } else {
    //             if (b > c) {
    //                 System.out.println(b + " is the highest number");
    //             } else {
    //                 System.out.println(c + " is the highest number");
    //             }
    //         }
    //     sc.close();
    //     }
    // }
 


// import java.util.Scanner;
// class Greatest{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int a=sc.nextInt();

//         System.out.println("Enter the second number: ");
//         int b=sc.nextInt();

//         System.out.println("Enter the third number");
//         int c=sc.nextInt();

//         if((a>b)&&(a>c)){
//             System.out.println("Greatest number is: "+a);
//         }
//         else if ((b>c) && (b>a))
//         {
//             System.out.println("Greatest number is: "+b);
//         }
//         else
//         {
//             System.out.println("Greatest number is: "+c);
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// class Check{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter any number: ");
//     int a=sc.nextInt();
//     if(a>0){
//         System.out.println("Given number is positive");
//     }
//     else if (a<0){
//         System.out.println("Given number is negative");
//     }
//     else{
//         System.out.println("Given number is zero");
//     }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// class Division{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number divisioble by 5 and 11: ");
//         int a=sc.nextInt();
//         if((a/5==0) && (a/11==0)){
//             System.out.println("Given number is divisible by both 5 and 11");
//         }
//         else{
//             System.out.println("Given number is not divisible by 5 and 11");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// class Evenodd{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any number: ");
//         int a=sc.nextInt();
//         if(a/2==0){
//             System.out.println("Given number is even");
//         }
//         else{
//             System.out.println("Given number is odd");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// class Leap{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any year: ");
//         int a=sc.nextInt();
//         if(((a%4==0) && (a%100!=0)) || (a%400==0))
//         {
//             System.out.println("Given year is leap year");
//         }
//         else{
//             System.out.println("Given year is not leap year");
//         }
//         sc.close();
//     }
//     }


import java.util.Scanner;
class Vowel{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char a=sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            System.out.println("Given alphabet is vowel");
        }
        else{
            System.out.println("Given alphabet is consonant");
        }
        sc.close();
    }
}