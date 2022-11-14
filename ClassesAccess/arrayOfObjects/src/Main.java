import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Point[] myArray = new Point[10];

        for (int i=0; i<10; i++)
            myArray[i] = new Point(r.nextInt(10));

        for (int i=0; i<10; i++)
            myArray[i].print();

        System.out.println();
        Point[] points = {new Point(1,2), new Point(), new Point(3)};

        for (var point: points)
            point.print();
    }
}
