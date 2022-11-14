public class Main {

    public static void main(String[] args) {
        String s = "This is a string";
        System.out.println(s.charAt(3));
        char[] ext = new char[2];
        s.getChars(5,7,ext,0);
        System.out.println(ext);
        ext = s.toCharArray();
        System.out.println(ext);
    }
}
