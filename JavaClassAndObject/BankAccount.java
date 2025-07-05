class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Ravi Kumar", "1234567890", 5000.0);

        account1.displayAccountDetails();
        System.out.println();
        account1.deposit(2000.0);
        account1.displayAccountDetails();
        System.out.println();
        account1.withdraw(3000.0);
        account1.displayAccountDetails();
        System.out.println();
        account1.withdraw(6000.0);
        account1.displayAccountDetails();
    }
}
