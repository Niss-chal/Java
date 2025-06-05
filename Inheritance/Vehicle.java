public class Vehicle{
    public void drive(){
        System.out.println("Car is driving");
    }
}

class Car extends Vehicle{
    public void display(){
        System.out.println("Car Model: Ferrari 488 spider ");
        System.out.println("Car type: Sports");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.display();
    }

}