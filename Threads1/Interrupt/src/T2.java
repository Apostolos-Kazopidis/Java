public class T2 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (long i = 0; i < 1000000000L; i++) {
            if (i%100000L==0 && t.isInterrupted()) { //ana 100000 bimata ginetai enas elegxos an mou exei erthei to interrupt
                System.out.println(t + " interrupted(i=" + i + ")"); // to piasame to interrupt (se 0.5s htan sto 565 ekatomiria)
                return; //epistrofh dhladh diakoph ekteleshs run
            }
        }
        System.out.println(t + ": exiting");
    }
}
