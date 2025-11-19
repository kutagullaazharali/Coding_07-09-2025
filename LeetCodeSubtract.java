public class LeetCodeSubtract {
    public static int subtractMethod(int n1, int n2) {
        int res = 0;
        while (true) { 
            if (n1 == 0 || n2 == 0) {
                break;
            }
            if (n1 >= n2) {
                n1 = n1 - n2;
                res++;
            }
            else if (n2 > n1) {
                n2 = n2 - n1;
                res++;  
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int output = subtractMethod(num1, num2);
        System.out.println("final output : "+output);
    }
}
