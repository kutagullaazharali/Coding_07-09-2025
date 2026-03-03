import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class GenerateParanthasis {
    public static void backtract(int start, int end, String current, ArrayList<String> results) {
        if ((start == 0) && (end == 0)) {
            results.add(current);
            return;
        }
        if (start >= 0) {
            backtract(--start, end, current + '(', results);
        }
        if (end >= 0) {
            backtract(start, --end, current + ')', results);
        }
    }

    public static List<String> GenerateParanthesis(int n) {
        ArrayList<String> results = new ArrayList<>();
        backtract(n, n, "", results);
        return results;
    }

    public static void main(String[] args) {
        int n = 1;
        List<String> output = GenerateParanthesis(n);
        System.out.println(output);
    }
}