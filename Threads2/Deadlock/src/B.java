public class B implements Runnable {
    A ob;

    public void setOb(A ob) {
        this.ob = ob;
    }

    synchronized void sync() {
        Thread t = Thread.currentThread();
        System.out.println(t + " inside B.sync");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ob.sync();
    }

    @Override
    public void run() {
        sync();
    }
}
