import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double sum=0;
        int counter =0;
        double mo;

        while(true) {
            System.out.println("Dwse mou pragmatiko  (q gia eksodo): ");
            if(sc.hasNextDouble()) {
                sum += sc.nextDouble();
                counter++;
            }
            else {
                if (sc.next().equals("q"))
                    break;
                System.out.println("Lathos typos dedomenwn!!!");
            }
        }

        if (counter==0) {
            System.out.println("Evales 0 arithmous");
        } else {
            mo = sum / counter;
            System.out.println("Mesos oros: "+mo);
        }
        sc.close();
    }
}