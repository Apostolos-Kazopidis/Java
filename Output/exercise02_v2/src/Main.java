import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static int readInt(Scanner sc, int lower, int upper) {
        int choice;
        while(true) {
            System.out.print("Your choice: ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice < lower || choice > upper) {
                    System.out.println("Error: Between 1 and 4");
                }
                else
                    return choice;
            }
            else {
                sc.next();
                System.out.println("Error: Invalid input");
            }
        }
    }

    public static int readInt2(Scanner sc, int lower, int upper) {
        int choice;
        while(true) {
            try {
                System.out.print("Your choice: ");
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    if (choice < lower || choice > upper) {
                        throw new Exception("Between 1 and 4");
                    } else
                        return choice;
                } else {
                    sc.next();
                    throw new Exception("Invalid input");
                }
            }
            catch (Exception e) {
                System.out.print("Error: " + e.getMessage() + "\n");
            }
        }
    }

    public static void print(Scanner sc) {
        System.out.print("Give N: ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++)
            System.out.println("Kalimera!");
    }

    public static void arrayManip(Scanner sc) {
        double[] array = new double[5];

        for (int i=0; i<array.length; i++) {
            System.out.print("Give " + (i+1) + " double: ");
            array[i] = sc.nextDouble();
        }

        double sum=0.0;
        for (int i=0; i<array.length; i++)
            sum += array[i];

        System.out.println("Average is " + sum/array.length);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);
            int choice;

            choice = readInt2(sc, 1, 4);


            switch(choice) {
                case 1:
                    System.out.print("Give an integer: ");
                    int v = sc.nextInt();
                    System.out.println("Square is " + Math.pow(v,2));
                    break;
                case 2:
                    print(sc);
                    break;
                case 3:
                    System.out.print("Give a float: ");
                    float f = sc.nextFloat();
                    System.out.printf(Locale.US, "1/4 is %.4f", f/4);
                    break;
                case 4:
                    arrayManip(sc);
            }

        }
    }
}
