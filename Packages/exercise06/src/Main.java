import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        String[] arr = {"A","B","C","D","E"};
        for (int i = 0; i < 5; i++)
            q.add(arr[i]);

        // Prints contents of the queue
        System.out.println(q);

        // Removes first
        System.out.println("Removing: " + q.remove());

        // Add another one
        q.add("F");
        System.out.println("Added 'F' ");

        System.out.println(q.size() + " elements in queue");

        String element;
        try {
            while (true) {
                System.out.println("Remove: " + q.remove());
            }
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty! ");
        }

    }
} 