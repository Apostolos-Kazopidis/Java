public class Main {
    public static void main(String[] args) {
        FuncInter f = (n1, n2)-> {
            n1 = n1 * 2;
            n2 = n2 * 2;
            return n1 + " " + n2;
        };
        System.out.println(f.func(3,5));
    }
}
