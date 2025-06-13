import java.util.Scanner;


abstract class Draw {
    abstract void calculateVolume();
    abstract void calculateArea();
    abstract void calculatePerimeter();
}


class Cube extends Draw {
    double side;

    Cube(double side) {
        this.side = side;
    }

    void calculateVolume() {
        double volume = Math.pow(side, 3);
        System.out.println("Volume of cube: " + volume);
    }

    void calculateArea() {
        double area = 6 * side * side;
        System.out.println("Surface area of cube: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 12 * side;
        System.out.println("Perimeter of cube: " + perimeter);
    }
}


class Cuboid extends Draw {
    double length, breadth, height;

    Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void calculateVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume of cuboid: " + volume);
    }

    void calculateArea() {
        double area = 2 * (length * breadth + breadth * height + length * height);
        System.out.println("Surface area of cuboid: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 4 * (length + breadth + height);
        System.out.println("Perimeter of cuboid: " + perimeter);
    }
}


class Cylinder extends Draw {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of cylinder: " + volume);
    }

    void calculateArea() {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of cylinder: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of cylinder: " + perimeter);
    }
}

public class CubeCuboidAndCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter side of cube: ");
        double cubeSide = sc.nextDouble();
        Draw cube = new Cube(cubeSide);

        
        System.out.print("Enter length of cuboid: ");
        double cuboidLength = sc.nextDouble();
        System.out.print("Enter breadth of cuboid: ");
        double cuboidBreadth = sc.nextDouble();
        System.out.print("Enter height of cuboid: ");
        double cuboidHeight = sc.nextDouble();
        Draw cuboid = new Cuboid(cuboidLength, cuboidBreadth, cuboidHeight);

        System.out.print("Enter radius of cylinder: ");
        double cylinderRadius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double cylinderHeight = sc.nextDouble();
        Draw cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        System.out.println();
        cube.calculateVolume();
        cube.calculateArea();
        cube.calculatePerimeter();

        System.out.println();
        cuboid.calculateVolume();
        cuboid.calculateArea();
        cuboid.calculatePerimeter();

        System.out.println();
        cylinder.calculateVolume();
        cylinder.calculateArea();
        cylinder.calculatePerimeter();

        sc.close();
    }
}
