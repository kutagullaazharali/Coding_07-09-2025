public class BinarySearch {
    public static int getvalues(int[] n, int target) {
        int left = 0;
        int right = n.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (n[mid] == target) {
                return mid;
            } else if (n[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5 };
        int i = 4;
        System.out.println("output : " + getvalues(n, i));
    }
}