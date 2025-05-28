import java.util.Scanner;
public class Employee {
    private String name;
    private String job_title;
    private double salary;

    public Employee(String name, String job_title, double salary){
        this.name=name;
        this.job_title=job_title;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob_Title(String job_title) {
        this.job_title = job_title;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public String getJob_Title() {
        return job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void printDetails(){
        System.out.println("Name of the employee: "+name+" \n Job title of the employee: "+job_title+" \n salary of the employee: "+salary );
    }

    public void updatesalary(double new_salary)
        {
        if(new_salary>0){
            salary=new_salary;
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name: ");
        String nme=sc.nextLine();

        System.out.println("Enter the job title: ");
        String job=sc.nextLine();

        System.out.println("Enter the salary: ");
        double slry=sc.nextDouble();
        sc.nextLine(); 

        Employee emp= new Employee(nme, job, slry);

        System.out.println("Do you want to update salary? (Y/N): ");
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("Y")){
            System.out.println("Enter the new salary amount: ");
            double new_salary=sc.nextDouble();
            emp.updatesalary(new_salary);
            emp.printDetails();
        }
        else{
            emp.printDetails();
        }
        sc.close();
    }
    
}
