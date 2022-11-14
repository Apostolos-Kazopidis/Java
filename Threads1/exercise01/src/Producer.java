public class Producer implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        try {
            for(int i=0; i<5; i++) {
                System.out.println(t+" producing "+ i);
                Thread.sleep(1000);
            }
        } catch(IllegalArgumentException | InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t+": exiting");
    }
}
