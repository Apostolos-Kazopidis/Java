public class Main {

    public static void main(String[] args) {
        Box<Integer> i = new Box<>(5);
        Box<String> s = new Box<>("some string");

        Integer iv = i.getData();
        String sv = s.getData();

        ObjectBox io = new ObjectBox(5);
        ObjectBox is = new ObjectBox("some string");

        iv = (Integer) io.getData();
        sv = (String) is.getData();
    }
}
