import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(10);

        Random r = new Random();

        for(int i=0; i<10; i++) {
            al.add(r.nextInt(10));
        }

        System.out.println(al);

        Collections.sort(al);


        System.out.println(al);

        int pos = Collections.binarySearch(al,4);

        if(pos>=0)
            System.out.println("To stoixeio vrethike sthn thesi "+pos);
        else
            System.out.println("Lypamai to stoixeio den vrethike...");







    }
}