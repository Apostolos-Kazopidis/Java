import java.util.ArrayList;

public class MyThread implements Runnable {
    private int init;
    private ArrayList<Integer> resource;
    final Object LOCK;

    public MyThread(int init, ArrayList<Integer> resource, Object LOCK) {
        this.init = init;
        this.resource = resource;
        this.LOCK = LOCK;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        t.setName("Worker" + init);


        for (int i = init; i < init + 4; i++) {
            System.out.println(t + " trying to add " + i);
            synchronized (LOCK) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                resource.add(i);
                System.out.println(resource);
            }
        }

        System.out.println(t + " finished! ");

    }
}
