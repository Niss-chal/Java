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
}

class Square extends Shape {
    public Square(int length, int breadth, double radius) {
        super(length, breadth, radius);
    }

    void calculateArea() {
        int area = length * length;
        System.out.println("Area of square is: " + area);
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
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();

        
        Rectangle rect = new Rectangle(length, breadth, radius);
        Square square = new Square(length, breadth, radius);
        Circle circle = new Circle(length, breadth, radius);

        
        rect.calculateArea();
        square.calculateArea();
        circle.calculateArea();

        sc.close();
    }
}
