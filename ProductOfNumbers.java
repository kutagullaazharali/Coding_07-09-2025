public class ProductOfNumbers {
    public static void main(String[] args) {
        int num = 234;
        int prod = 1;
        while(num!=0) {
            int last  = num%10;
            prod = prod*last;
            num/=10;
        }
        System.out.println("final output : "+prod);
    }
}
