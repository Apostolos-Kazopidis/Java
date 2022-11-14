import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("A file that exists: ");
        File f = new File("MyFile.txt");
        System.out.println(f.getName());
        System.out.println("Path: " + f.getAbsolutePath());
        System.out.println("is file: " + f.isFile());
        System.out.println("is directory: " + f.isDirectory());

        System.out.println("\nA directory that exists: ");
        File d = new File(".");
        String[] contents = d.list();
        System.out.print("Directory contents: " );
        for (var s: contents)
            System.out.print(s + " ");
        System.out.println();

        System.out.println("\nA file that doesn't exist: ");
        File ne = new File(".", "test.txt");
        System.out.println("is file: " + ne.isFile());
        System.out.println("is directory: " + ne.isDirectory());
    }
}
