public class Bulldog extends Dog{
    private int ears;

    public Bulldog(int weight, int height, int dB, int ears) {
        super(weight, height, dB);
        this.ears = ears;
    }

    public void sleep() {
        System.out.println("iam sleeping...");
    }
}
