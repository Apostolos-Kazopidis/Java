class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Apostolos Kazopidis","9153062349",500.0,4);
        ba.print();
        ba.setFullName("Xristos Ferentinos");
        ba.print();
        ba.setAccountYearsOpen(6);
        ba.print();
    }
}
