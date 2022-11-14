public class Main {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);

        t.setName("Main Thread");
        t.setPriority(8);
        System.out.println(t);
    }
}
