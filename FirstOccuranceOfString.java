
public class FirstOccuranceOfString {
    public static int findStringmethod(String mainstString, String minstString) {

        if (minstString.length() > mainstString.length()) {
            return -1;
        }
        for (int j = 0; j <= mainstString.length() - minstString.length(); j++) {
            String res = mainstString.substring(j, j + minstString.length());
            if (minstString.equals(res)) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String mainstString = "leetcode";
        String minstString = "code";
        int result = findStringmethod(mainstString, minstString);
        System.out.println("final output : " + result);
        // int index = str1.indexOf(str2);
        // System.out.println("final output : " + index);

    }
}
