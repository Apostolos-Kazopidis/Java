public class Main {
    public static void processInt(int input) {
        if (input<0)
            throw new IllegalArgumentException("Must be >=0");
        if (input>50)
            throw new IllegalArgumentException("Must be <=50");

        System.out.println("I am doing something with input: " + input);
    }
    public static void main(String[] args) {
        processInt(44);
        processInt(55);
    }
}
