public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setOb(b);
        b.setOb(a);
        Thread t1 = new Thread(a,"Thread A");
        Thread t2 = new Thread(b,"Thread B");
        t1.start();
        t2.start();
    }
}
