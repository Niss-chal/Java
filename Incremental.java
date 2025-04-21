public class Incremental{
    public static void main(String[] args) {
        int i=5; 
        // Suffix -- first completes other operations
        // then performs the unary operation
        int sum=6 + i++;
        System.out.println("Sum "+sum);
        int k=5;
        // Prefix -- first performs the unary operation
        // then completes other operations
        int sum1=6 + ++k;
        System.out.println("Sum1 "+sum1);
    }

}