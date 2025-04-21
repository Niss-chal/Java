// public class Second {
//     public static void main(String[] args)
//     {
//         int age=2;
//         if (age>=19) {
//             System.out.println("You can cast a vote");            
//         }
//         else{
//             System.out.println("You cannot vote");
//         }
//     }
    
// }

// public class Second{
//     public static void main(String[] args) {
//         int principal=1000;
//         int time=10;
//         int rate=10;
//         int interest=(principal*time*rate)/100;
//         System.out.println(interest);
//     }
// }


// public class Second{
//     public static void main(String[] args) {
//         int length=10;
//         int breadth=20,height=10;
//         int cuboid=length*breadth*height;
//         System.out.println(cuboid);
//         int cube=length*length*length;
//         System.out.println(cube);
//         int triangle=breadth*height*1/2;
//         System.out.println(triangle);
//     }
// }


// public class Second{
//     public static void main(String[] args) {
//         int age=19;
//         String a;
//         a=age>=18?"You can vote":"You cannot vote" ;
//         System.out.println(a);    
//     }
// }

// import java.util.Scanner;
// class age{
//     public static void main(String[] args) {
//         Scanner a=new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int age=a.nextInt();
//         System.out.println("Your age is: "+age);
//         a.close();
//         }

// }

// import java.util.Scanner;
// class calc{
//     public static void main(String[] args) {
//         Scanner calculate=new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int f_num=calculate.nextInt();
//         System.out.println("Enter the second number: ");
//         int s_num=calculate.nextInt();
//         int sum=f_num+s_num;
//         int product=f_num*s_num;
//         System.out.println("The sum of the two numbers is: "+sum);
//         System.out.println("The product of the two numbers is: "+product);
//         calculate.close();

//     }
// }

// import java.util.Scanner;
// class calc{
//     public static void main(String[] args) {
//         Scanner calculate=new Scanner (System.in);
//         System.out.println("Enter the first number: ");
//         int f_num=calculate.nextInt();
//         System.out.println("Enter the second number: ");
//         int s_num=calculate.nextInt();
//         int sum=f_num+s_num;
//         int product=f_num*s_num;
//         float division=(float)f_num/s_num;
//         System.out.println("The sum of two numbers is: "+sum);
//         System.out.println("The product of two numbers is: "+product);
//         System.out.println("The division of two numbers is: "+division);
//         calculate.close();
//     }
// }

// import java.util.Scanner;
// class Print{
//     public static void main(String[] args) {
//         Scanner print = new Scanner(System.in);
//         System.out.println("Enter the name: ");
//         String name=print.nextLine();

//         System.out.println("Enter your interst: ");
//         String interest=print.nextLine();

//         System.out.println("Enter your roll number: ");
//         int roll=print.nextInt();

//         System.out.println("Your name is: "+name);
//         System.out.println("Your roll number is: "+roll);
//         System.out.println("Your interest is: "+interest);
//         print.close();
//     }
// }

// import java.util.Scanner;
// class Calculate{
//     public static void main(String[] args) {
//         Scanner calc= new Scanner(System.in);
//         System.out.println("Enter the length: ");
//         Float length =(float) calc.nextInt();

//         System.out.println("Enter the Breadth: ");
//         Float breadth =(float) calc.nextInt();

//         System.out.println("Enter the Height: ");
//         Float height =(float) calc.nextInt();

//         System.out.println("Enter the Principal: ");
//         Float principal =(float) calc.nextInt();

//         System.out.println("Enter the Time: ");
//         Float time =(float) calc.nextInt();

//         System.out.println("Enter the Rate: ");
//         Float rate =(float) calc.nextInt();
        
//         Float area=length*length;
//         System.out.println("Area of square is: "+area);

//         Float perimeter=4*length;
//         System.out.println("Perimeter of square is: "+perimeter);

//         Float interest=(principal*rate*time)/100;
//         System.out.println("Interest is: "+interest);

//         Float cuboid=length*breadth*height;
//         System.out.println("Volume of cuboid is: "+cuboid);
//         Float cube=length*length*length;
//         System.out.println("Volume of cube is: "+cube);
//         Float triangle=breadth*height*1/2;
//         System.out.println("Area of triangle is: "+triangle);

//         calc.close();
//     }
// }