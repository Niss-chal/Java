public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true; 
    }

    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay > 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Rental price must be positive.");
        }
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The car has been rented.");
        } else {
            System.out.println("Sorry, the car is already rented.");
        }
    }

   
    public void returnCar() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("The car has been returned.");
        } else {
            System.out.println("The car is already available.");
        }
    }

    
    public void printDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Rental Price/Day: " + rentalPricePerDay);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

 
    public static void main(String[] args) {
        Car cr = new Car("Toyota", "Corolla", 60.0);
        cr.printDetails();

    
    }
}
