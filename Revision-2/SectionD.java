// // Question No:2
// class Employee{
//     String name;
//     int id;

//     Employee(String name, int id){
//         this.name = name;
//         this.id = id;
//     }
//     void calculateSalary(){
//         System.out.println("Calculating salary");
//     }
// }

// class FullTimeEmployee extends Employee{
//     double salary;

//     FullTimeEmployee(String name, int id, double salary){
//         super(name, id);
//         this.salary = salary;
//     }
//     @Override
//     void calculateSalary(){
//         System.out.println("Full-time employee salary: " + salary +" for " + name);

//     }
// }

// class PartTImeEmployee extends Employee{
//     double hourlyRate;
//     int hoursWorked;

//     PartTImeEmployee(String name, int id, double hourlyRate, int hoursWorked){
//         super(name, id);
//         this.hourlyRate = hourlyRate;
//         this.hoursWorked = hoursWorked;
//     }
//     @Override
//     void calculateSalary(){
//         double salary = hourlyRate * hoursWorked;
//         System.out.println("Part-time employee salary: " + (salary) + " for " + name);
//     }
// }

// public class SectionD {
//     public static void main(String[] args) {
//         Employee emp1 = new FullTimeEmployee("Ramesh", 101, 50000);
//         Employee emp2 = new PartTImeEmployee("Kamlesh", 102, 20, 100);
//         emp1.calculateSalary(); 
//         emp2.calculateSalary();
//     }
// }







// // Question No:3

// class Calculator{
//     int add( int a, int b){
//         return a+b;
//     }

//     double add(double a, double b){
//         return a+b;
//     }

//     String add(String a, String b){
//         return a+b;
//     }
// }

// public class SectionD {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println("Integer addition: " + calc.add(5, 10));
//         System.out.println("Double addition: " + calc.add(5.5, 10.2));
//         System.out.println("String concatenation: " + calc.add("Hello, ", "World!"));    
//     }
// }
