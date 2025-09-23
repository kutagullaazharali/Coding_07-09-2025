import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import  java.util.*;

public class GroupAnagram {
    public static ArrayList<List<String>> getCom(String[] str) {
        
     Map<String,List<String>> map = new HashMap<>();

        for(int i=0; i<str.length; i++) {
            String word = str[i];
            char c[] = word.toCharArray();
            Arrays.sort(c);
            String sb = new String(c);
            if(!map.containsKey(sb))
            {
                map.put(sb, new ArrayList<>());
            }
            map.get(sb).add(str[i]);
        }
       return new ArrayList<List<String>>(map.values());
    }
    public static void main(String[] args) {
        String str[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> s =  getCom(str);
        System.out.println(s);
    }
}
