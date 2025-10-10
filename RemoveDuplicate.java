class RemoveDuplicate {
    public static void main(String[] args) {
        int n[] = {21,35,35,47,47,56,68};
        int j = 0;
        for(int i=1; i<n.length; i++) {
            if(n[i]!=n[j]) {
                j++;
                int temp = n[i];
                n[i] = n[j];
                n[j] = temp;
            }
        }
        for(int i=0; i<j; i++) {
            System.out.println(" "+n[i]);
        }
    }
}