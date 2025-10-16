import java.util.Arrays;

public class ThinCore {


    public static boolean isMissing(int n, int num[]) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "6,1,2,3,4,5,100";
        String arr[] = s.split(",");
        int b[] = new int[arr.length];

        for (int i = 0; i <= arr.length - 1; i++) {
            b[i] = Integer.parseInt(arr[i]);
        }
        System.out.println("Before Sort : "+Arrays.toString(b));

        Arrays.sort(b);

        System.out.println("After Sort : "+Arrays.toString(b));

        int small = b[0];
        int big = b[b.length-1];
        System.out.println("Small : "+small);
        System.out.println("Big  : "+big);
        for(int i=small; i<=big; i++) {
           if(isMissing(i,b)){
                System.out.println(i);
           }
            
        }


    }
}
