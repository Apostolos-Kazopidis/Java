import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            while(true) {
                System.out.println(getName(sc));
            }
        }
    }

    public static String getName(Scanner sc) {
        String name;

        System.out.println("Give your surname: ");
        name = sc.next().strip().toLowerCase();
        return String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
    }
}