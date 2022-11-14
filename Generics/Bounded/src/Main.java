public class Main {

    public static void main(String[] args) {
        //Box<A> c = new Box<A>(1); //doesn't work
        Box<B> b = new Box<>(new B(1, 2));
        Box<C> c = new Box<>(new C(1,2, 3));
        System.out.println(b);
        System.out.println(c);
    }
}
