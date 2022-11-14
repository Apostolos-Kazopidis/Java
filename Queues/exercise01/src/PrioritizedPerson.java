public class PrioritizedPerson extends Person {
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
}
