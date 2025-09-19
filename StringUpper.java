public class StringUpper {
    public static void main(String[] args) {
        String str = "hello wOrLd";
        String finalString = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        System.out.println("final output  : " + finalString);

        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase());

        }
    }
}
