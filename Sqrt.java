class Sqrt {

    public static int squareMethod(int num) {
        if(num==1 || num == 0) { return num;}
        int ans = 0;
        int left = 0;
        int right = num;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(mid == num/mid) {
                return mid;
            }
            else if (mid < num/mid) {
                ans = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        } 
        return ans;
    }

    public static void main(String []args) {
        int x = 4;
        System.out.println("final output : "+squareMethod(x));

        
    }
}