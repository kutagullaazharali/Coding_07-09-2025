import java.math.BigInteger;

public class StringConcatnew {
    public static String addStrings(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger res = a.add(b);
        System.out.println(res);
    return res + "";
    }

    public static void main(String[] args) {
        String num1 = "6913259244", num2 = "71103343";
        System.out.println(addStrings(num1, num2));
    }
}
