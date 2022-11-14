import java.util.*;

public class Bank {
    private ArrayList<ArrayDeque<String>> cashDesks;

    public Bank(int N) {
        cashDesks = new ArrayList<>(N);
        for (int i=0; i<N; i++)
            cashDesks.add(new ArrayDeque<>());
    }

    public void customerEnters(String fullName) {
        Random r = new Random();
        int cashDesk = r.nextInt(cashDesks.size());
        cashDesks.get(cashDesk).add(fullName);
        System.out.println(fullName + " entered! To be served by cash desk: " + cashDesk);
    }

    public void customerServed() {
        Random r = new Random();
        ArrayList<Integer> notEmpty = new ArrayList<>();
        for (int i = 0; i < cashDesks.size(); i++)
            if (!cashDesks.get(i).isEmpty())
                notEmpty.add(i);

        if (notEmpty.isEmpty()) {
            System.out.println("No customers to serve!");
        } else {
            int cashDesk = notEmpty.get(r.nextInt(notEmpty.size()));
            String customer = cashDesks.get(cashDesk).pop();
            System.out.println("Customer: " + customer + " served by cash desk " + cashDesk);
        }
    }

    @Override
    public String toString() {
        String s = "\n" + "=".repeat(20);
        for (int i=0; i<cashDesks.size(); i++) {
            s += "\nCash Desk " + i + ": ";
            s += cashDesks.get(i).toString();
        }
        s += "\n" + "=".repeat(20) + "\n";

        return s;
    }
}
