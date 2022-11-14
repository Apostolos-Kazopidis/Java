import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<PrioritizedPerson> q = new PriorityQueue<>();

        q.add(new PrioritizedPerson("Apostolos","Bketos",3));
        q.add(new PrioritizedPerson("Antonios","Damaridis", 1));
        q.add(new PrioritizedPerson("Lakis","Cvalas", 4));
        q.add(new PrioritizedPerson("Losi","Aasa",5));

        System.out.println(q);

        while(!q.isEmpty()) {
            System.out.println("removed "+q.remove());
        }




    }
}