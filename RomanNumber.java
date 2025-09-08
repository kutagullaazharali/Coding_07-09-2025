
import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public static int RomantoInteger(String s)
    {
        Map<Character,Integer> res = new HashMap<>();
        res.put('I',1);
        res.put('V',5);
        res.put('X',10);
        res.put('L',50);
        res.put('C',100);
        res.put('D',500);
        res.put('M',1000);
        int results = 0 ;
        for(int i=0; i<s.length()-1;i++) {
            if(res.get(s.charAt(i)) < res.get(s.charAt(i+1))) {
                results -= res.get(s.charAt(i));
            }
            else {
                results += res.get(s.charAt(i));
            }
        }
        return results+=res.get(s.charAt(s.length()-1));
    }
    public static void main(String[] args) {
        String str = "VI";
        int results = RomantoInteger(str);
        System.out.println("Final Output : "+results);
    }
}
