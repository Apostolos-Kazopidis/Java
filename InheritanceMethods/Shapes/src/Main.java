import java.util.Random;

class Main {

    public static void main(String[] args) {
        Shape[] array = new Shape[10];
        Random r = new Random();

        for (int i=0; i<array.length; i++)
            switch (r.nextInt(5)) {
                case 0:
                    array[i] = new Shape();
                    break;
                case 1:
                    array[i] = new Triangle();
                    break;
                case 2:
                    array[i] = new Square();
                    break;
                case 3:
                    array[i] = new Ellipse();
                    break;
                case 4:
                    array[i] = new Cycle();
                    break;
            }

        for (Shape s : array)
            s.drawShape();

    }
}
