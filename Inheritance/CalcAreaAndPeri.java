import java.util.Scanner;

class Shape {
    int length;
    int breadth;
    double radius;

    public Shape(int length, int breadth, double radius) {
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    public Rectangle(int length, int breadth, double radius) {
        super(length, breadth, radius);
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }

    void calculatePerimeter() {
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }
}

class Circle extends Shape {
    public Circle(int length, int breadth, double radius) {
        super(length, breadth, radius);
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2*Math.PI * radius;
        System.out.println("Perimeter of circle is: " + perimeter);
    }
}


public class CalcAreaAndPeri  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();

        
        Rectangle rect = new Rectangle(length, breadth, radius);
        Circle circle = new Circle(length, breadth, radius);

        
        rect.calculateArea();
        circle.calculateArea();

        System.out.println();

        rect.calculatePerimeter();
        circle.calculatePerimeter();

        sc.close();
    }
}

