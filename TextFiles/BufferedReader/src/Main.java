import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("text_bufferedwriter.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(f))) {

            /* read a line */
            String s = br.readLine();
            System.out.print(s + "\n");
            /* read a chunk of data */
            char[] buf = new char[30];
            br.read(buf);
            System.out.print(buf);
            /* read 1 char at a time */
            int c;
            while((c=br.read())!=-1) {
                System.out.print((char) c);
            }

        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}
