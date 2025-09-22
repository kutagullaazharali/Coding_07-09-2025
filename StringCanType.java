

public class StringCanType {
    public static boolean checkStringMethod(String text, String brokenLetters) {
        for(char c : text.toCharArray()) {
            if(brokenLetters.indexOf(c)!=-1) {
                return false;
            }
        }
        return true;
    }

    public int canBeTypedWords(String text, String brokenLetters) {
        String str[] = text.split(" ");
        for(String s : str) {
            if(checkStringMethod(s,brokenLetters)) {
                System.out.println("output : "+s);
            }
        } 
        return 0;
    }
    public static void main(String[] args) {
        StringCanType obj = new StringCanType();
        String tex = "hello world";
        String brokenWord = "ad";
        System.out.println("final output : "+obj.canBeTypedWords(tex,brokenWord));
    }
}
