public class Main {

    public static void main(String[] args) {
        String s = "abc";
        A<String> box = new A<>(String.class);
        System.out.println(box);
    }
}
