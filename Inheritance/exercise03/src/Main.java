public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(500.0);
        Credit credit = new Credit(230.0,"314-214-456","03/24");
        Check check = new Check(333.0,20,"1234-5678-12345");

        payment.print();
        credit.print();
        check.print();
    }
}