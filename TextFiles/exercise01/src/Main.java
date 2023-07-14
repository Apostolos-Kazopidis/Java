import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("shakespeare.txt");
        File f2 = new File("shakespeare2.txt");

        int lines=0;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            while(br.readLine()!=null) 
                lines++;
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("lines: "+lines);



        String[] data = new String[lines];
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            int i=0;
            String s;
            while((s=br.readLine())!=null) {
                data[i] = s;
                i++;
            }


        } catch (IOException e) {
            System.err.println(e);
        }

        for(var line: data) {
            System.out.println(line);
        }



        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f2)))) {

            for(int i=0; i< data.length; i++) {
                pw.print(data[i]+"\n\n");
            }

        } catch (IOException e) {
            System.err.println(e);
        }






    }
}
