public class Main {
    public static void main(String[] args) {
        FuncInter<Integer> f = (n)->n/2;
        System.out.println(f.func(5));

        FuncInter<Double> d = (n)->n/2;
        System.out.println(d.func(5.0));
    }
}
