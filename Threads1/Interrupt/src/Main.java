public class Main {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        t.setName("Main");

        Thread sleeper = new Thread(new T1(), "Sleeper");
        sleeper.start();
        try {
            Thread.sleep(1000);
            System.out.println(t + " interrupting " + sleeper);
            sleeper.interrupt();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("=".repeat(50));
        Thread worker = new Thread(new T2(), "Worker");
        worker.start();
        try {
            Thread.sleep(500);
            System.out.println(t + " interrupting " + worker);
            worker.interrupt();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
