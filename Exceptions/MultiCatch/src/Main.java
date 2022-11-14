public class Main {

    public static void main(String[] args) {
        try {
            int[] ar = new int[5];

            ar[11] /= 0;
            ar[11] = 1;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ob) {
            ob.printStackTrace();
        }
    }
}
