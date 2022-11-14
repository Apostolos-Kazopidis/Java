public class Check extends Payment{
    private int number;
    private String bankCode;

    Check(double amount, int number, String bankCode) {
        super(amount);
        this.number=number;
        this.bankCode=bankCode;
    }

    public int getNumber() {
        return number;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void print() {
        System.out.println("Check:");
        System.out.println("amount: "+getAmount());
        System.out.println("number: "+getNumber());
        System.out.println("bankCode: "+getBankCode());
    }
}
