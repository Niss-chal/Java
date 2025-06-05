public class Employee {
    public void work(){
        System.out.println("Employee is Working");
    }
    public double getSalary(){
        return 50000;
    }
}

class HRManager extends Employee{
    public void work(){
        System.out.println("Hr Manager is Working");
    }

    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary is: "+hr.getSalary());
    }
}
