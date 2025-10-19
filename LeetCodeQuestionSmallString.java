import java.util.Arrays;

public class LeetCodeQuestionSmallString {
    public static void addMethod(String num[],int v) {
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 1) {
                int digit = Integer.parseInt(num[i]);
                int finalValue = digit + v % 10;
                num[i] = String.valueOf(finalValue);
            }
        }
    }
    public static void rotateArray(String[] arr,int start,int end) {
        while (start <= end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("After reverse : "+Arrays.toString(arr));
    }

    public static String findLexSmallestString(String s, int a, int b) {
        String res = "";
        String arr[] = s.split("");
        rotateArray(arr, 0, arr.length - 1);
        rotateArray(arr,b,arr.length-1);
        rotateArray(arr, 0,b-1);
        // System.out.println("array : " + Arrays.toString(arr));
        String Strnew = String.join("", arr);
        int OrgValue = Integer.parseInt(s);
        int count = 1;
        int a1 = b;
        while (a != 0) {
            res = String.join("", arr);
            int r = Integer.parseInt(res);
            if (r < OrgValue) {
                OrgValue = r;
            }
            a--;
            count++;
            addMethod(arr,a1);
        }
        return String.join("",arr);
    }

    public static void main(String[] args) {
        String s = "5525";
        int originalNumber = Integer.parseInt(s);
        System.out.println("origina; string : " + s);
        int a = 9, b = 2;
        String output = findLexSmallestString(s, a, b);
        

    }
}
