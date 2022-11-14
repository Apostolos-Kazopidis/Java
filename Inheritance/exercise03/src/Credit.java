public class Credit extends Payment{
    private String number;
    private String expDate;

    Credit(double amount, String number, String expDate) {
        super(amount);
        this.number = number;
        this.expDate = expDate;
    }

    public String getNumber() {
        return number;
    }

    public String getExpDate() {
        return expDate;
    }

    public void print() {
        System.out.println("Credit:");
        System.out.println("amount: "+getAmount());
        System.out.println("number: "+getNumber());
        System.out.println("expDate: "+getExpDate());
    }
}
