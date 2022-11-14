import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("object_stream.bin");

        A a;

        try(ObjectInputStream os = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(f)))) {
            a = (A) os.readObject();
            System.out.println(a);
        }
        catch(IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
    }
}
