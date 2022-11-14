import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>();
        char c = 'a';
        for (int i=0; i<26; i++) {
            al.add(c);
            c++;
        }
        System.out.println(al + "Size: " + al.size());

        ArrayList<Character> al2 = new ArrayList<>();

        char c2 = 'k';

        for(int i=0; i<16; i++) {
            al2.add(c2);
            c2++;
        }

        System.out.println(al2 + "Size: " + al2.size());

        if(al.containsAll(al2)) {
            System.out.println("Periexontai ola ta stoixeia!!!");
        }


    }
}
