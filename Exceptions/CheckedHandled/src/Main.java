import java.io.*;
public class Main {

    public static void f() {
        try {
            FileInputStream f;
            f = new FileInputStream("text.txt");
            int i;
            while ((i = f.read()) != -1) {
                System.out.print((char)i);
            }
            f.close();
        } catch (IOException ob) {
            System.out.println(ob);
        }
    }

    public static void main(String[] args) {
        f();
    }
}
