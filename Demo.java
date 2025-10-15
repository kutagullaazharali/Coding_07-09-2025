class Bank {
    private int AccountNumber;
    private String AccountHolderName;
    private String BankName;
    private int Balance;

    public Bank(int number, String name, int balance, String BankName) {
        this(100);
        this.AccountNumber = number;
        this.AccountHolderName = name;
        this.Balance = balance;
        this.BankName = BankName;
        
    }

    public Bank(int balance) {
        this.Balance = balance;
    }

    public int getBalance() {
        return Balance;
    }

    public int SetBalance(int bal) {
        if (bal > 1) {
            Balance += bal;
        }
        return bal;
    }

    public static void main(String[] args) {
        Bank bank1 = new Bank(12345678, "SAI", 10000, "SBI");
        Bank bank2 = new Bank(234545678, "surya", 12000, "HDFI");
        Bank bank3 = new Bank(234325678, "Siva", 15000, "SBI");

        System.out.println("Name : " + bank1.AccountHolderName + "  " + bank1.AccountNumber + "  " + bank1.getBalance());
        System.out.println("Name : " + bank2.AccountHolderName + "  " + bank2.AccountNumber + "  " + bank2.getBalance());
        System.out
                .println("Name : " + bank3.AccountHolderName + "  " + bank3.AccountNumber + "  " + bank3.getBalance());
                System.out.println(bank3.getBalance());

        
                System.out.println(bank3.SetBalance(10));
        
                                System.out.println(bank3.getBalance());


    }
}