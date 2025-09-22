
import java.util.HashMap;
import java.util.Map;



public class isomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        Map<Character,Character> maps = new HashMap<>();
        Map<Character,Character> mapt = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(maps.containsKey(cs) && maps.get(cs)!=ct) {return false;}
            if(mapt.containsKey(ct) && mapt.get(ct)!=cs) {return false;}
            maps.put(ct,cs);
            maps.put(cs,ct);
        }

        return true;
    }

    public static void main(String[] args) {
        isomorphicString obj = new isomorphicString();
        String s = "egg";
        String t = "add";
        if(obj.isIsomorphic(s,t)){
            System.out.println("output : "+true);
        }
        else {
            System.out.println("output : "+false);
        }
    }
}
