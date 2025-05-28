import java.util.Scanner;
public class SimpleInterest {
    private double principal;
    private double time;
    private double rate;

    public SimpleInterest(double principal,double time, double rate){
        this.principal=principal;
        this.time=time;
        this.rate=rate;
    }

    public void setPrincipal(double principal){
        this.principal=principal;
    }

    public void setTime(double time){
        this.time=time;
    }

    public void setRate(double rate){
        this.rate=rate;
    }

    public double getPrincipal(){
        return principal;
    }

    public double getTime(){
        return time;
    }

    public double getRate(){
        return rate;
    }

    public void SI(){
        double interest=(principal*time*rate)/100;
        System.out.println("Simple interest is: "+interest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal");
        double p=sc.nextDouble();
        System.out.println("Enter the time: ");
        double t=sc.nextDouble();
        System.out.println("Enter the rate: ");
        double r=sc.nextDouble();

        SimpleInterest simpleinterest=new SimpleInterest(p, t, r);
        simpleinterest.SI();
        sc.close();
    }
    
}
