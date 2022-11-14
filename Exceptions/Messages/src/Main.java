public class Main {
    public static void main(String[] args) {
        try {
            int a = 1/0;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
