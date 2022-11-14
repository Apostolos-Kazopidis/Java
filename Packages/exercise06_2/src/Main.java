import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        q.add("Bob");
        q.add("Tom");
        System.out.println(q.remove() + " served.");
        q.add("Pam");
        System.out.println(q.remove() + " served.");
        System.out.println(q.remove() + " served.");
    }
} 