abstract class Bird{
    abstract void fly();
}

class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle can fly");
    }
}

class Penguin extends Bird{
    public void fly(){
        System.out.println("Penguins cannnot fly");
    }
}

public class Birds{
    public static void main(String[] args) {
        Eagle egle = new Eagle();
        Penguin pgin = new Penguin();
        egle.fly();
        pgin.fly();
    }
}