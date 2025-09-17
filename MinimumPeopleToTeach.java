import java.util.*;

public class MinimumPeopleToTeach {
    public static int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        // Convert each user's language list to a Set for fast lookup
        List<Set<Integer>> userLanguages = new ArrayList<>();
        for (int[] langList : languages) {
            Set<Integer> set = new HashSet<>();
            for (int lang : langList) {
                set.add(lang);
            }
            userLanguages.add(set);
        }
        System.out.println("userLanguages" + userLanguages);

        // Step 1: Find all friendship pairs that can't communicate
        Set<Integer> needToTeach = new HashSet<>();
        List<int[]> toFix = new ArrayList<>();

        for (int[] friendship : friendships) {
            int u = friendship[0] - 1; // 0-based indexing
            int v = friendship[1] - 1;

            Set<Integer> langsU = userLanguages.get(u);
            Set<Integer> langsV = userLanguages.get(v);

            boolean canTalk = false;
            for (int lang : langsU) {
                if (langsV.contains(lang)) {
                    canTalk = true;
                    break;
                }
            }

            if (!canTalk) {
                toFix.add(new int[] { u, v });
            }
        }

        // Step 2: For each language, count how many users in broken friendships need to
        // learn it
        int minToTeach = Integer.MAX_VALUE;

        for (int lang = 1; lang <= n; lang++) {
            Set<Integer> teachSet = new HashSet<>();
            for (int[] pair : toFix) {
                int u = pair[0], v = pair[1];
                if (!userLanguages.get(u).contains(lang)) {
                    teachSet.add(u);
                }
                if (!userLanguages.get(v).contains(lang)) {
                    teachSet.add(v);
                }
            }
            minToTeach = Math.min(minToTeach, teachSet.size());
        }

        return minToTeach;
    }

    public static void main(String[] args) {
        // Mapping for better readability
        String[] userNames = { "Alice", "Bob", "Charlie" };
        String[] langNames = { "English", "Spanish" };

        int n = 2;

        int[][] languages = {
                { 1 }, // Alice
                { 2 }, // Bob
                { 1, 2 } // Charlie
        };

        int[][] friendships = {
                { 1, 2 },
                { 1, 3 },
                { 2, 3 }
        };
        int result = minimumTeachings(n, languages, friendships);
        System.out.println("Minimum number of people to teach: " + result);
    }
}
