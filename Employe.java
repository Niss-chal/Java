public class Employe {
    private String name;
    private String employeeId;
    private double salary;

    public Employe(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double amount) {
        double newSalary = this.salary + amount;
        if (newSalary >= 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Error: Salary cannot be negative. Operation aborted.");
        }
    }

    public void printDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
    Employe emp = new Employe("Aarav", "EMP101", 0);
    emp.printDetails();

    emp.updateSalary(5000);  
    emp.printDetails();


}

}

    
