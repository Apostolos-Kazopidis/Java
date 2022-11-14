public class Main {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.isAlive());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("exiting...");
    }
}
