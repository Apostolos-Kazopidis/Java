import java.util.*;

public class Main {

    public static int readInt(Scanner sc, int lower, int upper) {
        int choice;
        while(true) {
            try {
                System.out.print("Your choice: ");
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    if (choice < lower || choice > upper) {
                        throw new Exception("Between " + lower + " and " + upper);
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

    public static void main(String[] args) {
        HashSet<String> hm = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {

            boolean exit=false;
            while(!exit) {
                int choice;

                System.out.println("1-add element");
                System.out.println("2-remove element");
                System.out.println("3-print all");
                System.out.println("4-exit");
                choice = readInt(sc, 1, 4);

                switch (choice) {
                    case 1:
                        System.out.print("Give a string: ");
                        if(!hm.add(sc.next()))
                            System.out.println("Already in set");
                        else
                            System.out.println("Added!");
                        break;
                    case 2:
                        System.out.print("Give a string: ");
                        if (!hm.remove(sc.next()))
                            System.out.println("Not in set");
                        else
                            System.out.println("Removed!");
                        break;
                    case 3:
                        String[] ar = new String[hm.size()];
                        hm.toArray(ar);
                        Arrays.sort(ar);
                        System.out.println(String.join(", ", ar));
                        break;
                    case 4:
                        System.out.println("Bye bye");
                        exit=true;
                        break;
                    default:
                        System.out.println("Wrong Input");
                }
            }
        }
    }
}
