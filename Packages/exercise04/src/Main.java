import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N=10;
        int[] array = new int[N];

        Random r = new Random();

        for(int i=0; i<N; i++) {
            array[i]= r.nextInt(0,6);
            System.out.print(array[i]+" ");
        }

        System.out.println();
        Arrays.sort(array);

        for(int i=0; i<N; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Position: "+Arrays.binarySearch(array,3));



    }
}