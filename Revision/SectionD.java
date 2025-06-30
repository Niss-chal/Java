// // Question number: 1
// class Vehicle{
//     String brand;
    
//     Vehicle(String brand){
//         this.brand=brand;
//     }

//     void start(){
//         System.out.println(brand+" is starting");
//     }
// }

// class Car extends Vehicle{
//     String model;

//     Car(String brand, String model){
//         super(brand);
//         this.model=model;
//     }   

//     @Override
//     void start(){
//         super.start();
//         System.out.println("Car model: " + model + " is starting");
//     }
// }

// public class SectionD{
//     public static void main(String[] args) {
//         Car car = new Car("Ferrari" , "488 Piesta");
//         car.start();
//     }
// }

// // Question number: 2
// class Student{
//     int id;
//     String name;
//     int marks;

//     Student(int id, String name, int marks){
//         this.id = id;
//         this.name = name;
//         this.marks = marks;
//     }

//     String calculateGrade(){
//         if(marks>=80){
//             return "A";
//         } else if(marks>=60){
//             return "B";
//         } else if(marks>=40){
//             return "C";
//         } else {
//             return "D";
//         }
//     }

//     void displayInfo(){
//         System.out.println("ID: " + id);
//         System.out.println("Name: " + name);
//         System.out.println("Marks: " + marks);
//         System.out.println("Grade: " + calculateGrade());
//     }    
// }

// public class SectionD{
//     public static void main(String[] args) {
//         Student student1 = new Student(1, "Ramesh", 85);
//         Student student2 = new Student(2, "Kamlesh", 70);
//         Student student3 = new Student(3, "Hari", 55);
//         Student student4 = new Student(4, "Sita", 30);

//         student1.displayInfo();
//         System.out.println();
//         student2.displayInfo();
//         System.out.println();
//         student3.displayInfo();
//         System.out.println();
//         student4.displayInfo();
//     }
// }
