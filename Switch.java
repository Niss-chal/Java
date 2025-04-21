public class Switch {
    public static void main(String[] args) {
        String day="Saturday";
        switch (day){
        case "Sunday":
            System.out.println("First day of the week");
            break;
        case "Monday":
            System.out.println("Second day of the week");
            break;
        default:
            System.out.println("Some other day of the week");
            break;
        }
    }
    
}
