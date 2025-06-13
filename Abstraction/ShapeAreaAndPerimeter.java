import java.util.Scanner;

abstract class Shapes {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Rectangle extends Shapes {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }

    void calculatePerimeter(){
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }
}

class Circle extends Shapes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }

    void calculatePerimeter(){
        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter of cirlce is: "+perimeter);
    }
}

class Triangle extends Shapes{
    double a,b,c;

    Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    void calculateArea(){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is: "+area); 
    }

    void calculatePerimeter(){
        double perimeter = a+b+c;
        System.out.println("Perimeter of triangle is: "+perimeter);
    }

}

public class ShapeAreaAndPerimeter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int breadth = sc.nextInt();


        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter first side of triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter second side of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter third side of triangle: ");
        double c = sc.nextDouble();

        Rectangle rect = new Rectangle(length, breadth);
        Circle circ = new Circle(radius);
        Triangle tri = new Triangle(a, b, c);        

        rect.calculateArea();
        rect.calculatePerimeter();
        System.out.println();
        circ.calculateArea();
        circ.calculatePerimeter();
        System.out.println();
        tri.calculateArea();
        tri.calculatePerimeter();

        sc.close();
    }
}
