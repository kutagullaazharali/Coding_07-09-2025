public class CommonElements {
    public static void main(String args[]) {
        int arr1[] = {1,2,4,3,5,6,7};
        int arr2[] = {2,3,6,5,7};

        for(int i=0; i<arr1.length; i++) {
            int count = 0;
            for(int j=0; j<arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    count++;
                }
            }
            if(count>=1) {
                System.out.println("element : "+arr1[i]);
            }
        }
    }
}
