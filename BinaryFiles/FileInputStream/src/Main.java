import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("file_stream.bin");

        try(BufferedInputStream bs = new BufferedInputStream(new FileInputStream(f))) {
            byte[] b = new byte["This is a line".getBytes().length];
            bs.read(b);
            System.out.println(new String(b));
            b = new byte[4];
            bs.read(b);
            for (var bt: b)
                System.out.println(bt);
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}
