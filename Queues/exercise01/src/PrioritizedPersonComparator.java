import java.util.Comparator;

public class PrioritizedPersonComparator implements Comparator<PrioritizedPerson> {

    @Override
    public int compare(PrioritizedPerson o1, PrioritizedPerson o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}

