public class Student {
    private int student_id;
    private String student_name;
    private double GPA;

    public Student(String student_name, int student_id, double GPA) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.GPA = GPA;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public double getGPA() {
        return GPA;
    }

    public void printDetails() {
    System.out.println("Student ID: " + student_id);
    System.out.println("Student Name: " + student_name);
    System.out.println("GPA: " + GPA);
    }

    public static void main(String[] args) {
        Student std = new Student("Sam", 1001, 3.8);
        std.setStudent_name("Samuel");
        std.printDetails();
    }
}
