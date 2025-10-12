import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "hello world";
        String arr[] = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(new StringBuilder(str).reverse().append(" "));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("final output : "+result);
    }
}
