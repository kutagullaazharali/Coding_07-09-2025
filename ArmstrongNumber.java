
public class ArmstrongNumber {
    public boolean isArmstrong(int num) {
        int len = String.valueOf(num).length();
        int original = num;
        int sum = 0;
        while(num!=0) {
            int last = num%10;
            sum += Math.pow(last,len);
            num /=10;
        } 
        return original == sum;
    }
    public static void main(String args[]) {
        ArmstrongNumber obj = new ArmstrongNumber();
        int n = 153;
        boolean res = obj.isArmstrong(n);
        System.out.println(" Number : " + n + " : "+res);
    }
}
