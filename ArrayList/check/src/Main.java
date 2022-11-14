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
        al.set(25, 'a');
        System.out.println("First 'a': " + al.indexOf('a') +
                            ", Last 'a':" + al.lastIndexOf('a'));
        System.out.println(al.isEmpty());
    }
}
