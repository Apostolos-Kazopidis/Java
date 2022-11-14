import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("text_bufferedwriter.txt");

        /* Creating a new file */
        try(BufferedWriter bw = new BufferedWriter(
                                new FileWriter(f))) {
            bw.write("This is a line");
            bw.write("And another one");
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}
