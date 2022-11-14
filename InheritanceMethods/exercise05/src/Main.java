class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Jim Psoun", "123-4938-2939", 100, 8);
        System.out.println(b);
        b.setFullName("Jim Psounis");
        System.out.println(b);
        b.setYearsActive(9);
        System.out.println(b);
    }
}
