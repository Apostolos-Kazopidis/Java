import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Test t = () -> 5;

        System.out.println(t.test());

        Random r = new Random();
        t = () -> r.nextInt(0,10);

        System.out.println(t.test());
    }
}