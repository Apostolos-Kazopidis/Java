import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("object_stream.bin");

        A a = new A(1,2.0, "abc");

        try(ObjectOutputStream os = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(f)))) {
            os.writeObject(a);
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}
