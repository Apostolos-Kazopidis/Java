public class Consumer implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        try {
            for(int i=0; i<3; i++) {
                System.out.println(t+" consuming "+i);
                Thread.sleep(500);
            }
        } catch(IllegalArgumentException | InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t+": exiting");
    }
}
