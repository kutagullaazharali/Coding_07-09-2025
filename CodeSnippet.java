
import java.util.Arrays;

class CodeSnippt {
    public static void main(String[] args) {
        int arr[] = { 0,0,0,0,0,0};
        System.out.println("Original Array : "+Arrays.toString(arr));
        int i = 0;
        System.out.println("i = starting value : "+i);
        arr[i] = i = 1;
        // System.err.println(arr[i] = i = 2);
        System.out.println("i = ending value : "+i);
        System.out.println("Changed Array : "+Arrays.toString(arr));
    }
}