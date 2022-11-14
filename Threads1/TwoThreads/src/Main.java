public class Main {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("The Parent");

        MyThread t2 = new MyThread("The Child");
        t2.start();
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(500);
                System.out.println(t + " step: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("exiting...");
    }
}
