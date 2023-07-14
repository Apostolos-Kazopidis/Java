public class T2 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (long i = 0; i < 1000000000L; i++) {
            if (i%100000L==0 && t.isInterrupted()) { 
                System.out.println(t + " interrupted(i=" + i + ")"); 
                return; 
            }
        }
        System.out.println(t + ": exiting");
    }
}
