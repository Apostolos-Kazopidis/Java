public class Main {

    public static Object mult(Object v, int times) {
        if (v instanceof Number) {
            int x = ((Number) v).intValue();
            return times * x;
        }
        else if (v instanceof String) {
            String s = (String) v;
            return s.repeat(times);
        }
        else throw new IllegalArgumentException("Not valid arg");
    }


    public static void main(String[] args) {
        System.out.println(mult(4, 5));
        System.out.println(mult(4.2f, 5));
        System.out.println(mult("abra", 5));
    }
}
