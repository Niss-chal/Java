abstract class Vechicle{
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vechicle{
    public void startEngine(){
        System.out.println("Car engine is starting");
    }

    public void stopEngine(){
        System.out.println("Car engine has stopped");
    }
}

class Motorbike extends Vechicle{
    public void startEngine(){
        System.out.println("Bike engine is starting");
    }

    public void stopEngine(){
        System.out.println("Bike engine has stopped");
    }   
}

public class Vechicles{
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike bike = new Motorbike();

        car.startEngine();
        car.stopEngine();
        System.out.println();
        bike.startEngine();
        bike.stopEngine();
    }
    
}
