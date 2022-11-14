import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double x;
            double y;

            while(true) {
                System.out.print("x=");

                if(sc.hasNextInt()) {
                    x = sc.nextInt();
                    break;
                } else {
                    System.out.println("ERROR...Use an integer please!!!");
                    sc.next();
                }
            }

            while(true) {
                System.out.print("y=");

                if(sc.hasNextInt()) {
                    y = sc.nextInt();
                    break;
                } else {
                    System.out.println("ERROR...Use an integer please!!!");
                    sc.next();
                }
            }

            System.out.println("x/y=" + x/y);
        }
    }
}