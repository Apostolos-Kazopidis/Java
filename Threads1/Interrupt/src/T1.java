public class T1 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        try {
            System.out.println(t + " sleeping: ");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(t + " interrupted ");
        }
        System.out.println(t + " exiting");
    }
}
