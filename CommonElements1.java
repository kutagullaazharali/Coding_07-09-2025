import java.util.HashSet;

public class CommonElements1 {
    public static void main(String []args){
        int arr1[] = {1,2,4,3,5,6,7,3};
        int arr2[] = {2,3,6,5,7};
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1) {
            set.add(i);
        }
        for(int i = 0; i<arr2.length;i++) {
            if(set.contains(arr2[i])) {
                System.out.println(arr2[i]);
            }
        }

    }
}
