public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

       try {
            int res = a / b;
            System.out.println("Result = " + res);
        } catch (ArithmeticException ob) {
            System.out.println(ob);
        } finally {
            System.out.println("No crash!");
        }
        System.out.println("Continuing execution");


    }
}
