import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("The Parent");

        ArrayList<Integer> al = new ArrayList<>();
        final Object LOCK = new Object();

        Thread[] threads = new Thread[3];
        for (int i=0; i<threads.length; i++) {
            threads[i] = new Thread(new MyThread(i * 10, al, LOCK));
            threads[i].start();
        }

        try {
            for (int i=0; i<threads.length; i++)
                threads[i].join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t + ": exiting");
    }
}
