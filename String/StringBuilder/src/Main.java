public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Test String");
        System.out.println(sb + ", C: " + sb.capacity() + ", L: " + sb.length() + ", H: " + sb.hashCode());
        sb.append("01234567890123456789");
        System.out.println(sb + ", C: " + sb.capacity() + ", L: " + sb.length() + ", H: " + sb.hashCode());
        sb.delete(0, 20);
        System.out.println(sb + ", C: " + sb.capacity() + ", L: " + sb.length() + ", H: " + sb.hashCode());
        sb.insert(2, "XXX");
        System.out.println(sb + ", C: " + sb.capacity() + ", L: " + sb.length() + ", H: " + sb.hashCode());
    }
}
