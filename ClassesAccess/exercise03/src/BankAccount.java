public class BankAccount {
    private String fullName;
    private String accountNumber;
    private double balance;
    private int accountYearsOpen;

    BankAccount(String fullName, String accountNumber, double balance, int accountYearsOpen) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountYearsOpen = accountYearsOpen;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountYearsOpen() {
        return accountYearsOpen;
    }

    public void setAccountYearsOpen(int accountYearsOpen) {
        this.accountYearsOpen = accountYearsOpen;
    }

    public void print(){
        System.out.println("fullName: "+fullName+" \naccountNumber: "+accountNumber+" \nbalance: "+balance+" \naccountYearsOpen: "+accountYearsOpen);
    }










}
