package hierarchial_inheritance_package;

class BankAccount {
 String accountNumber;  
 double balance;        

 BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: Rs" + balance);
 }
}

class SavingsAccount extends BankAccount {
 double interestRate; 

 SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance); 
     this.interestRate = interestRate;
 }

 public void displayAccountType() {
     System.out.println("Account Type: Savings Account");
     displayAccountInfo();
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}

class CheckingAccount extends BankAccount {
 double withdrawalLimit; 

 CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
     super(accountNumber, balance);
     this.withdrawalLimit = withdrawalLimit;
 }

 public void displayAccountType() {
     System.out.println("Account Type: Checking Account");
     displayAccountInfo();
     System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
 }
}

class FixedDepositAccount extends BankAccount {
 int term; 

 FixedDepositAccount(String accountNumber, double balance, int term) {
     super(accountNumber, balance);
     this.term = term;
 }

 public void displayAccountType() {
     System.out.println("Account Type: Fixed Deposit Account");
     displayAccountInfo();
     System.out.println("Term: " + term + " months");
 }
}

public class Bank {
 public static void main(String[] args) {
     SavingsAccount savings = new SavingsAccount("123", 10000, 4.5);
     CheckingAccount checking = new CheckingAccount("456", 5000, 2000);
     FixedDepositAccount fixed = new FixedDepositAccount("789", 25000, 12);

     System.out.println("SAVINGS ACCOUNT");
     savings.displayAccountType();

     System.out.println("\nCHECKING ACCOUNT");
     checking.displayAccountType();

     System.out.println("\nFIXED DEPOSIT ACCOUNT");
     fixed.displayAccountType();
 }
}