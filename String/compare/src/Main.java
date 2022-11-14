public class Main {

    public static void main(String[] args) {
        String s = "test";
        System.out.println(s.equals("test"));
        System.out.println(s.compareTo("abc"));
        System.out.println(s.compareTo("test"));
        System.out.println(s.compareTo("zxy"));
        System.out.println("ABC".compareTo("abc"));
        System.out.println("ABC".compareToIgnoreCase("abc"));

        System.out.println(s.equalsIgnoreCase("Test"));
    }
}

