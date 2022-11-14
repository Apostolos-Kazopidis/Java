import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();

        point.print();

        Random r = new Random();

        point.set(r.nextInt(11),r.nextInt(11));

        point.print();

        point.x = r.nextInt(10,21);
        point.y = r.nextInt(10,21);

        point.print();

    }
}