public class Producer implements Runnable {
    private int init;
    private Resource resource;

    public Producer(int init, Resource resource) {
        this.init = init;
        this.resource = resource;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        t.setName("Producer" + init);

        for (int i = init; i < init + 4; i++) {
            // processing some data
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            // adding to the resource
            resource.add(i);
        }
        System.out.println(t + " finished! ");
    }
}
