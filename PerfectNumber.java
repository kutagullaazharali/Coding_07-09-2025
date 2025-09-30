public class PerfectNumber {
    public static void CheckPerfectNumber(int n) {
        int res = 0;
        for(int i=1 ; i<=n/2; i++) {
            if(n%i == 0) {
                res += i;
            }
        }
        if(res == n){
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        int n = 28;
        CheckPerfectNumber(n);
    }
}
