import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f = new File("text_filewriter.txt");

        /* Creating a new file */
        try(FileWriter fw = new FileWriter(f)) {
            fw.write("This is a line");
            fw.write("And another one");
        }
        catch(IOException e) {
            System.err.println(e);
        }

        /* If we reopen it, then it will be erased */
       try(FileWriter fw = new FileWriter(f)) {
            fw.write("A new line");
        }
        catch(IOException e) {
            System.err.println(e);
        }

        /* But you can open it in append mode */
        try(FileWriter fw = new FileWriter(f,true)) {
            fw.write("\nAnd append some lines");
        }
        catch(IOException e) {
            System.err.println(e);
        }

        /* It's hard to work with other data types, except characters */
        try(FileWriter fw = new FileWriter(f,true)) {
            double d=1.17;
            fw.write("\n" + d);
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}
