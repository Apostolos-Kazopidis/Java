import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            Day d = null;

            while(d == null) {
                String s;

                try {
                    System.out.println("Give me a random day of the week:");
                    s = sc.next().toUpperCase(); //monday to MONDAY
                    d = Day.valueOf(s);
                } catch(IllegalArgumentException e) {
                    System.out.println("Please type a valid day...");
                }
            }
            System.out.println(d);
        }
    }
}