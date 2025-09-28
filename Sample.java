
import java.util.Arrays;

public class Sample {
    public static void test(int... i) {
        System.out.println("arguments : "+Arrays.toString(i));
        int res[] = i;
        System.out.println("Array : "+Arrays.toString(res));
        System.out.println("length of the arguments : "+i.length);
    }
    public static void main(String[] args) {
        for(String s : args) {
            System.out.println("testing : "+s.length());
        }
    //  test(1,2,3,4);   
    }
}
