public class CarandBike {
    void startEngiene(){
        System.out.println("Engiene is starting");
    }
    void stopEngiene(){
        System.out.println("Engiene has stopped");
    }    
}

class Car extends CarandBike{
    void drive(){
        System.out.println("Car is being driven");
    }
}

class Motorcycle extends CarandBike{
    void ride(){
        System.out.println("Motorcycle is being ridden");
    }
}

class PrintDetails{
    public static void main(String[] args) {
    Car car = new Car();
    car.startEngiene();
    car.drive();
    car.stopEngiene();

    System.out.println();

    Motorcycle motorcycle = new Motorcycle();
    motorcycle.startEngiene();
    motorcycle.ride();
    motorcycle.stopEngiene();
}
}
