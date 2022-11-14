public class PrioritizedPerson extends Person implements Comparable<PrioritizedPerson> {
    private int priority;

    PrioritizedPerson(String firstName, String lastName, int priority) {
        super(firstName,lastName);
        this.priority = priority;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + priority + ")";
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(PrioritizedPerson o) {
        return Integer.compare(o.getPriority(), getPriority());
    }
}
