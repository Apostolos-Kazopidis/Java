import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File f = new File("text_bufferedwriter.txt");

        try(Scanner sc = new Scanner(f)) {
            sc.useLocale(Locale.US);
            while (sc.hasNext()) {
                int i = sc.nextInt();
                String s = sc.next();
                double d = sc.nextDouble();
                System.out.println(i + "\t" + s + "\t" + d);
            }
        }
        catch (FileNotFoundException e) {
            System.err.print(e);
        }

    }
}
