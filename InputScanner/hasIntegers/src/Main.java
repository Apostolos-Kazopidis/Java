import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("Type some integer and (q) to quit: ");
            if (sc.hasNextInt())
                sum += sc.nextInt();
            else {
                if (sc.next().equals("q"))
                    break;
                System.out.println("Only integers please!");
            }
        }
        System.out.println("Their sum is " + sum);

        sc.close();
    }
}