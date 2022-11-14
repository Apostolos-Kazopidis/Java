public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            array[5] = 15;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}