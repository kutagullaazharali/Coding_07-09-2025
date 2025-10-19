import java.util.*;
class Sample5 {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for (int i : n) {
            count++;
            if (count == 3) {
                al.add(10, 100);
            }
            al.add(i);
        }
        System.out.println("final output : "+al);
    }
}