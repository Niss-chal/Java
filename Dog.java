import java.util.Scanner;
public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public void printDetails(){
        System.out.println("The name of dog is "+name+" and breed is "+breed);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the name of one dog: ");
        String name1=sc.nextLine();

        System.out.println("Enter the breed of one dog");
        String breed1=sc.nextLine();

        System.out.println("Enter the name of another dog: ");
        String name2=sc.nextLine();

        System.out.println("Enter the breed of another dog");
        String breed2=sc.nextLine();

        Dog dog1= new Dog(name1, breed1);
        dog1.printDetails();

         Dog dog2= new Dog(name2, breed2);
        dog2.printDetails();

        sc.close();
    }
    
}
