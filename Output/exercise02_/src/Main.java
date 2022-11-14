import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static int readInt(Scanner sc, int lower, int upper) {
        int choice;
        while(true) {
            System.out.print("Press a number from 1 ... to 4: ");
            if(sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice<lower || choice>upper) {
                    System.out.println("Error: Press a number between 1 and 4...");
                } else
                    return choice;
            } else {
                sc.next();
                System.out.println("Error: Invalid input...");
            }
        }
    }

    public static int readInt2(Scanner sc, int lower, int upper) {
        int choice;
        while(true) {
            try {
            System.out.print("Press a number from 1 ... to 4: ");
            if(sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice<lower || choice>upper) {
                    throw new Exception("Press a number between 1 and 4...");
                } else
                    return choice;
            } else {
                sc.next();
                throw new Exception("Invalid input...");
            }
        } catch (Exception e) {
                System.out.println("Error: "+e.getMessage() + "\n");
            }
            }
    }

    public static void print(Scanner sc) {
        int N;
        System.out.println("Vale enan akeraio arithmo: ");
        N = sc.nextInt();

        for(int i=0; i<N; i++) {
            System.out.println("Kalimera");
        }
    }

    public static void arrayManip(Scanner sc) {
        int N=5;
        double sum=0.0;
        double[] array = new double[N];

        System.out.println("Dwse arithmous gia ypologismo mesou orou: ");
        for(int i=0; i<N; i++) {
            array[i] = sc.nextDouble();
            sum+=array[i];
        }
        System.out.println("Mesos oros: "+sum/N);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);
            int choice;

            choice = readInt2(sc,1,4);

            switch(choice) {
                case 1:
                    System.out.println("Give an integer: ");
                    int v = sc.nextInt();
                    System.out.println("Square is "+Math.pow(v,2));
                    break;
                case 2:
                    print(sc);
                    break;
                case 3:
                    float z;
                    System.out.println("Dwse mou mia float timh: ");
                    z=sc.nextFloat();
                    System.out.printf(Locale.US,"To 1/4 tou arithmou: %.4f einai to %.4f",z,z/4);
                    break;
                case 4:
                    arrayManip(sc);
                    break;
            }


        }


    }
}