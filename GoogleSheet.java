class GoogleSheet {
    public static String getGoogleSheetCol(int n) {
        StringBuilder sb = new StringBuilder();

        while(n>0) {
            n--;
            int remainder = n % 26;
            sb.append((char)('A'+remainder));
            n/=26;
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int n = 28;
        String res = getGoogleSheetCol(n);
        System.out.println(res);
    }
}