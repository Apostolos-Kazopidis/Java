public class A implements Runnable {
    B ob;

    public void setOb(B ob) {
        this.ob = ob;
    }

    synchronized void sync() {
        Thread t = Thread.currentThread();
        System.out.println(t + " inside A.sync");
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
