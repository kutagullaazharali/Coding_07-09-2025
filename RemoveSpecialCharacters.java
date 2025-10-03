public class RemoveSpecialCharacters {
    public static void main(String args[]) {
        String str = "hello@";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >= 'a'&& str.charAt(i) <= 'z'){
                System.out.println("Alpha : "+str.charAt(i));
            }
        }
    }
}
