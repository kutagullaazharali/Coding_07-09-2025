public class RemoveDuplicatesInArray {
    public static void main(String args[]) {
        char ch[] = {'a','@','b','s','#','B','A','D','D'};
        for(int i=0; i<ch.length;i++) {
            if((ch[i] >='a' && ch[i] <= 'z' ) || (ch[i] >='A' && ch[i] <= 'Z')) {
                System.out.println("alpha : "+ch[i]);
            }
        }
    }
}
