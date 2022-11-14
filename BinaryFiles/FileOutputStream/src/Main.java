import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("file_stream.bin");

        /* Creating a new file */
        try(BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f))) {
            bs.write("This is a line".getBytes());
            byte[] bytes = {1,2,3,4};
            bs.write(bytes);
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}
