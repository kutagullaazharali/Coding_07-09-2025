class TernarySearch {
    public static int ternarySearch(int n[], int key) {
        int low = 0;
        int high = n.length - 1;
        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = high - (high - low) / 2;
            if (n[mid1] == key) {
                return mid1;
            }
            if (n[mid2] == key) {
                return mid2;
            }
            if (n[mid1] < key) {
                low = mid1 +1;
            }
            else if (n[mid2] > key) {
                high = mid2 - 1;
            }
            else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38};
        int key = 16;
        int result = ternarySearch(arr, key);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}