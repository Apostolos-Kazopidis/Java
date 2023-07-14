public class Main {
    public static void main(String[] args) {

        try {
            String s = null;
            s.equals("oops");
        } catch (NullPointerException e) {
            System.out.println("ERROR..."+e);
        }

    }
}
