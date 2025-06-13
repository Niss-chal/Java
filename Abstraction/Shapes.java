import java.util.Scanner;

abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int breadth = sc.nextInt();


        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();


        Rectangle rect = new Rectangle(length, breadth);
        Circle circ = new Circle(radius);


        rect.calculateArea();
        circ.calculateArea();

        sc.close();
    }
}
