
import java.util.HashMap;
import java.util.Map;

class maxFreq{
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        System.out.println("sample : "+map);
        int output=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > output){
                output = entry.getValue();
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == output){
               count++;
            }
        }

       return output*count;
         
    }

    public static void main(String[] args) {
        maxFreq obj =  new maxFreq();
        int arr[] = {1,2,2,3,1,4};
        int res = obj.maxFrequencyElements(arr);
        System.out.println("final output : "+res);
    }
}
