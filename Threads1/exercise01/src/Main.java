public class Main {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        t.setName("Main");

        Thread[] producers = new Thread[3];
        for(int i=0; i<3; i++) {
            producers[i] = new Thread(new Producer(),"producer"+i);
            producers[i].start();
        }

        Thread[] consumers = new Thread[5];
        for(int i=0; i<5; i++) {
            consumers[i] = new Thread(new Consumer(),"consumer"+i);
            consumers[i].start();
        }

        try{
            for(int i=0; i< producers.length; i++)
                producers[i].join();

            for(int i=0; i<consumers.length; i++)
                consumers[i].join();
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t+": exiting");
    }
}