import java.util.*;
import java.util.List;

class Leetcodecontext {
    static public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        int max = 0;
        for (int b : bulbs) {
            max = Math.max(max, b);
        }
        System.out.println(max);

        int flag[] = new int[max + 1];
        System.out.println(Arrays.toString(flag));
        for (int i : bulbs) {
            flag[i]++;
        }
        System.out.println(Arrays.toString(flag));
        List<Integer> output = new ArrayList<>();
        System.out.println(output);
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] %2 == 1) {
                output.add(i);
            }
            System.out.println("i : " + i);
        }

        return output;
    }

    public static void main(String[] args) {
        int nums[] = { 1,1,1 };
        ArrayList<Integer> output = new ArrayList<>();
        output.add(10);
        output.add(11);
        output.add(12);
        output.add(12);
        System.out.println(toggleLightBulbs(output));
    }
}
