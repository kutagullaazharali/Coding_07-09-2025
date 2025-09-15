public class ReverseStr {
    public static String RevMethod(String s) {
        if(s.isEmpty() || s.length()==1){
            return s;
        }
        return s.substring(1)+s.charAt(0);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Final Output : "+RevMethod(str));
    }
}
