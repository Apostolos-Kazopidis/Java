import java.io.*;
public class Main {

    public static void f() throws IOException {
        FileInputStream f;
        f = new FileInputStream("text.txt");
        int i;
        while ((i = f.read()) != -1) {
            System.out.print((char)i);
        }
        f.close();
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (IOException ob) {
            System.out.println(ob);
        }
    }
}
