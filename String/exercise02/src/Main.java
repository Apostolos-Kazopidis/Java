import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String s = "Education is one thing no one can take away from you";

        try (Scanner sc = new Scanner(System.in)) {
            while(true) {
                System.out.print("Input string: ");
                String s2 = sc.next();
                if (s2.equals("quit")) {
                    System.out.println("Bye bye");
                    break;
                }
                if (s.indexOf(s2)==-1) {
                    System.out.println("String doesn't exist");
                }
                else {
                    int pos = s.indexOf(s2);
                    while(pos!=s.lastIndexOf(s2)) {
                        System.out.println("Positions: " + s.indexOf(s2, pos) + "-" + (s.indexOf(s2, pos)+s2.length()-1));
                        pos = s.indexOf(s2, pos+1);
                    }
                    System.out.println("Positions: " + s.indexOf(s2, pos) + "-" + (s.indexOf(s2, pos)+s2.length()-1));

                    System.out.println(s.replace(s2, "X".repeat(s2.length())));
                }
            }
        }
    }
}
