import java.io.*;

class Checked {
    public static void main(String args[])
    {
        FileInputStream f;
        f = new FileInputStream("text.txt");
        int c;

        while(( c = f.read() ) != -1)
        {
            System.out.print(c);
        }

        f.close();
    }
}