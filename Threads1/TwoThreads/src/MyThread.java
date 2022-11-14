public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                sleep(500);
                System.out.println(toString() + " step: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
