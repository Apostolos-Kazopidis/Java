public class Dog extends Animal{
    private int dB;

    public Dog(int weight, int height, int dB) {
        super(weight, height);
        this.dB = dB;
    }

    public void bark() {
        System.out.println("woof woof");
    }


}
