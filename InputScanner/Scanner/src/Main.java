import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a string: ");
        String s = sc.next();

        System.out.print("Type an integer: ");
        int i = sc.nextInt();

        System.out.print("What is value of PI: ");
        double d = sc.nextDouble();

        System.out.println("string: " + s);
        System.out.println("int   : " + i);
        System.out.println("double: " + d);

        sc.close();
    }
}
