public class FactorialNumber {
    public static void main(String []args) {
        int n = 5;
        int sum = 1;
        for(int i= 1;i<=n;i++) {
            sum = i*sum;
        }
        System.out.println("final sum of the factorial : "+sum);
    }
}