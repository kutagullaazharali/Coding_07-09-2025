import java.util.List;
import java.util.ArrayList;

public class TestGenePara {
    public static void backtract(int open, int close, String current, ArrayList<String> results) {
        if (open == 0 && close == 0) {
            results.add(current);
            return;
        }
        if (open > 0) {
            backtract(open - 1, close, current + '(', results);
        }
        if (close > open) {
            backtract(open, close - 1, current + ')', results);
        }
    }

    public static List<String> GenerateParanthesis(int n) {
        ArrayList<String> results = new ArrayList<>();
        backtract(n, n, "", results);
        return results;
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> output = GenerateParanthesis(n);
        System.out.println(output);
    }
}