public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 13;
        String binary = "";
        int num = n;
        while(num>0) {
            int remainder = num%2;
            binary = remainder+binary;
            num/=2;
        }
        System.out.println("original decimal : "+n);
        System.out.println("binary number : "+binary);
    }
}
