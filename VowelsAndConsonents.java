import java.util.HashMap;
import java.util.Map;

public class VowelsAndConsonents {
     public int maxFreqSumNew(String s) {
        int arr[] = new int[26];
        for(char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        int maxVowel=0,maxConsonent=0;

        for(int i=0; i<arr.length; i++) {
            char ch = (char) ('a' + i);
            if("aeiou".indexOf(ch) !=-1) {
                maxVowel = Math.max(maxVowel, arr[i]);
            }
            else {
                maxConsonent = Math.max(maxConsonent, arr[i]);
            }
        }
        return maxVowel+maxConsonent;
     }
    public int maxFreqSum(String s) 
    {
        Map<Character,Integer> mapVowel = new HashMap<>();
        Map<Character,Integer> mapConsonant = new HashMap<>();
        for(int i=0;i<s.length();i++) {

         if(s.charAt(i)=='a'  || 
            s.charAt(i)=='e'  ||
            s.charAt(i) =='i' ||
            s.charAt(i) == 'o'||
            s.charAt(i) =='u') {
               if(mapVowel.containsKey(s.charAt(i))) {
                mapVowel.put(s.charAt(i),mapVowel.get(s.charAt(i))+1);
               }
               else {
                 mapVowel.put(s.charAt(i),1);
               }
            }
            else {
                if(mapConsonant.containsKey(s.charAt(i))) {
                  mapConsonant.put(s.charAt(i),mapConsonant.get(s.charAt(i))+1);
                }
                else {
                    mapConsonant.put(s.charAt(i),1);
                }
            }
        }
        System.out.println("testing : "+mapVowel);
        System.out.println("testing : "+mapConsonant);
        int max1 = 0;
        for (Map.Entry<Character, Integer> entry : mapVowel.entrySet()) {
            int temp1 = entry.getValue();
            if(temp1 > max1) {
                max1 = temp1;
            }
        }

        int max2 = 0;
        for (Map.Entry<Character, Integer> entry : mapConsonant.entrySet()) {
            int temp2 = entry.getValue();
            if(temp2 > max2) {
                max2 = temp2;
            }
        }
        System.out.println("final output 1 : "+max1);
        System.out.println("final output 1 : "+max2);

        return max1+max2;
    }

    public static void main(String[] args) {
        VowelsAndConsonents obj = new VowelsAndConsonents();
        // System.out.println("final output : "+obj.maxFreqSum("successes"));
        System.out.println("final output : "+obj.maxFreqSumNew("successes"));

    }
}
