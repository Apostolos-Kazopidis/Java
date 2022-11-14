import java.io.FileInputStream;
import java.io.IOException;

class Main {
    public static void h() throws IOException {
        /*int a = 1/0;*/

        FileInputStream f;
        f = new FileInputStream("text.txt");
        int i;
        while ((i = f.read()) != -1) {
            System.out.print((char)i);
        }
        f.close();
    }

    public static void g() throws IOException {
        h();
    }

    public static void f() {
        try {
            g();
        } catch (Exception ob) {
            System.out.println("Error: Catched it at f()");
        }
    }

    public static void main(String[] args) {
        f();
    }
}
