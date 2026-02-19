public class LeetCodeBug {
    static public boolean validMountainArray(int[] arr) {
        if (arr.length == 1) {
            return false;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left + 1 < arr.length && arr[left] < arr[left + 1]) {
            left++;
        }
        while (right > 0 && arr[right - 1] > arr[right]) {
            right--;
        }
        if (right == arr.length - 1) {
            return false;
        }
        System.out.println("Test");
        System.out.println("left : " + left);
        System.out.println("right : "+right);
        return right == left;
    }

    public static void main(String[] args) {
        int num[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(validMountainArray(num));
    }
}
