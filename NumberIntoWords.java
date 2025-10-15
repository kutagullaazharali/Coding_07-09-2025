class NumberIntoWords {
    private static final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", 
        "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", 
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", 
            "Sixty", "Seventy", "Eighty", "Ninety" };
        
    public static String helperMethod(int n) {
        String results = "";

        if (n < 20) {
            results = belowTwenty[n];
        }
        else if (n < 100) {
            results = tens[n / 10] + " " + helperMethod(n % 10);
        }
        else if (n < 1000) {
            results = helperMethod(n / 100) + " Hundred " + helperMethod(n % 100);
        }
          else if(n<1000000) {
            results = helperMethod(n / 1000) + " Thousand  " + helperMethod(n % 1000);
        }
        return results;
    }

    public static String getWordMethod(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helperMethod(num).trim();
    }
    public static void main(String[] args) {
        int n = 90900;
        System.out.println("input number : " + n);
        System.out.println(getWordMethod(n));
    }
}