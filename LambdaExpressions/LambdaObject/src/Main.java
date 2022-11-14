public class Main {

    public static void main(String[] args) {

        String[] array = {"yolo"};

        FuncInter f = (n)->n/2;
        System.out.println(f.getClass());

        f = (x) -> x*x;
        System.out.println(f.getClass());

        f = (n) -> 2*n + 1;
        System.out.println(f.getClass());
    }
}
