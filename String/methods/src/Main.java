public class Main {

    public static void main(String[] args) {
        System.out.println(" blank\n".strip());
        System.out.println("lower".toUpperCase());
        System.out.println("uPPer".toLowerCase());
        System.out.println("=".repeat(50));
        System.out.println("0123456".substring(2));
        System.out.println("0123456".substring(2,4));
        String[] ar = {"a", "b", "c"};
        System.out.println(String.join(",", ar));
    }
}
