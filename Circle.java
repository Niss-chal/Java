import java.util.Scanner;
public class Circle{
    private double radius;
    // Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Setter
    public void setRadius(double radius){
        this.radius=radius;
    }

    // Getter
    public double getRadius(){
        return radius;
    }

    // Method to get area of circle
    public void area(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle is: "+area);
    }
    // Method to get circumference of circle
    public void circumference(){
        double circumference=2*Math.PI*radius;
        System.out.println("Circumference of circle is: "+circumference);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the radius of circle: ");
        double r=sc.nextDouble();
        Circle circle = new Circle(r);
        circle.area();
        circle.circumference();      
        sc.close();
        
    }
}