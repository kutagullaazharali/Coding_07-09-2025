import java.util.Arrays;

public class MergeSort1 {
    public static void MergeSorMethod(int arr[],int l,int r) {
        if(l<r) {
            int m = (r+l)/2;
            MergeSorMethod(arr, l, m);
            MergeSorMethod(arr, m+1, r);
            merge(arr,l,m,r);
        }
    }


    public static void merge(int[] arr,int left,int mid,int right) {
    int n1=mid-left+1;
    int n2=right-mid;
    int l[] = new int[n1];
    int r[] = new int[n2];
        for(int i=0;i<n1;i++){
            l[i] = arr[left+i];
        } 
        for(int j=0;j<n2;j++){
            r[j] = arr[mid+1+j];
        } 
        int i=0,j=0,k=left;
        while(i<n1 && j<n2) {
            if(l[i]<=r[j]) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while(i<n1) {
            arr[k++] = l[i++];
        }
        while(j<n2) {
            arr[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array : "+Arrays.toString(arr));
        MergeSorMethod(arr,0,arr.length-1);
        System.out.println("Original Array : "+Arrays.toString(arr));
    }
}