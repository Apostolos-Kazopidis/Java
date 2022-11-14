class Main {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }
        catch (ArithmeticException ob) {
            System.out.println("Error: Division by Zero!");
        }
    }
}
