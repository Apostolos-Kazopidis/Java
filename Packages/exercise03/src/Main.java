import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        Random r = new Random();
        double[] array = new double[N];

        for(int i=0; i<N; i++) {
            array[i] = r.nextDouble(20.0,30.0);
            //array[i] = 20+r.nextDouble()*10;
            System.out.println(array[i]);
        }
    }
}