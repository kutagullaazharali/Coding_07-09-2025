public class BinarySerachForVersion {
      public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while(left<right) {
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }  
      }
    public static void main(String[] args) {
        int n = 5;

    }
}
