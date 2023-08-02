import java.util.Random;

public class exercise04 {
    public static void main(String[] args) {
        int N=10;
        int sum=0;
        double average;
        int[] array = new int[N];

        Random r = new Random();

        for(int i=0; i<N; i++){
            array[i]=r.nextInt(1000);
            System.out.print(array[i]+" ");
        }

        for(int i=0; i<N; i++){
            sum=sum+array[i];
        }
        average=sum/(double)N;

        System.out.println();
        System.out.println("O mesos oros twn stoixeiwn tou pinaka einai: "+average);
    }
}
