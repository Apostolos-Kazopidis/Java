public class Main {
    public static void main(String[] args) {
        try {
            int[] array = new int[(int) 1e10];
        } catch (OutOfMemoryError e) {
            System.out.println("Error: Out of Memory");
        }
    }
}