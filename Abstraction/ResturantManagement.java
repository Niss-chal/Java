interface Employee{
    void work();
    int getSalary();   
}

class Chef implements Employee{
    public void work(){
        System.out.println("Chef is cooking");
    }

    public int getSalary(){
        return 50000;
    }
}

class Waiter implements Employee{
    public void work(){
        System.out.println("Waiter is serving");
    }

    public int getSalary(){
        return 25000;
    }
}
public class ResturantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        chef.work();
        System.out.println("Chef salary is: "+chef.getSalary());
        System.out.println();
        waiter.work();
        System.out.println("Waiter salary is: "+waiter.getSalary());
    }    
}
