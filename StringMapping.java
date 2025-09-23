import java.util.HashMap;
import java.util.Map;

public class StringMapping {
     public static boolean wordPattern(String pattern, String s) {
        char ch[] = pattern.toCharArray();
        String words[] = s.split(" ");
        if(ch.length != words.length) { return false; }
        Map<String,Character> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();

        for(int i=0; i<words.length ; i++) {
            if(!map1.containsKey(words[i]) && map1.get(words[i]) !=ch[i] ) {
                return false;
            }
            else {
                map1.put(words[i], ch[i]);
            }
        }
        System.out.println("output : "+map1);
        return true;
    }
    public static void main(String[] args) {
      String pattern = "abba";
      String s = "dog cat cat fish";
      System.out.println("final output : "+wordPattern(pattern,s));   
    }
}
