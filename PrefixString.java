public class PrefixString {
    public static void main(String[] args) {
        String arr[] = {"flowers","flow","flight"};
        if (arr == null || arr.length == 0) {
            System.out.println("empty array");
        }
        String prefix = arr[1];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("()");
                }
            }
        }
        System.out.println("final results : "+prefix);
    }
}
