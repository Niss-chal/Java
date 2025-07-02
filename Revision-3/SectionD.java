// // Question No 1
// class Animal{
//     void makeSound() {
//         System.out.println("Animal sound");
//     }
// }

// class Mammal extends Animal{
//     @Override
//     void makeSound() {
//         System.out.println("Mammal makes sound");
//     }
// }

// class Dog extends Animal{
//     @Override
//     void makeSound() {
//         System.out.println("Dog barks");
//     }
// }   

// public class SectionD {
//     public static void main(String[] args) {
//         Animal animal = new Animal();
//         Animal mammal = new Mammal();
//         Animal dog = new Dog();

//         animal.makeSound(); 
//         mammal.makeSound(); 
//         dog.makeSound();    
//     }
// }

// // Question No 2
// import java.util.ArrayList;
// import java.util.Scanner;

// class Course{
//     String courseId;
//     String courseName;
//     String instructor;

//     Course(String courseId, String courseName, String instructor) {
//         this.courseId = courseId;
//         this.courseName = courseName;
//         this.instructor = instructor;
//     }

//     void display(){
//         System.out.println("Course ID: " + courseId);
//         System.out.println("Course Name: " + courseName);
//         System.out.println("Instructor: " + instructor);
//         System.out.println();
//     }
// }

// public class SectionD{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Course> courses = new ArrayList<>();
//         System.out.println("How many courses do you want to register? ");
//         int n = sc.nextInt();
//         sc.nextLine(); // Consume newline

//         for (int i=0; i<n; i++){
//             System.out.println("Enter details for course "+(i+1));
//             System.out.println("Course Id: ");
//             String id = sc.nextLine();

//             System.out.println("Course Name: ");
//             String name = sc.nextLine();

//             System.out.println("Instructor: ");
//             String instructor = sc.nextLine();

//             Course course = new Course(id, name, instructor);
//             courses.add(course);
//         }

//         System.out.println("\nRegistered Courses:");
//         for(int i=0; i<courses.size(); i++){
//             System.out.println("Course " + (i+1) + ":");
//             courses.get(i).display();
//         }
//         sc.close();

//     }
// }