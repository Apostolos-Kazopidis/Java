public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("The Parent");

        Thread t2 = new Thread(new MyThread(),"The Child");
        t2.start();
        try {
            t2.join(); //The parent joins The child //parent freezes and is waiting for the child to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t + ": exiting");
    }
}
