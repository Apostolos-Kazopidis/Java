import java.util.Comparator;

public class PrioritizedPersonComparator implements Comparator<PrioritizedPerson> {

    @Override
    public int compare(PrioritizedPerson o1, PrioritizedPerson o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}

//2os tropos
//Gia na apofygw na grafw olh auth thn gkoumoutsa
//return Integer.compare(o1, o2);
// o1 < o2  tha epistrepsei timh <0
// GIA AUTO KANW MIA ANTISTROFH ORISMATWN
// return Integer.compare(o2, o1);
//ARA
// return Integer.compare(o2.getPriority(), o1.getPriority());

//3os tropos
//        if (o1.getPriority() > o2.getPriority())
//               return -1;
//                else if (o1.getPriority() == o2.getPriority())
//                return o1.getLastName().compareTo(o2.getLastName());
//                else
//                return 1;

//1os tropos
//        if (o1.getPriority() > o2.getPriority())
//               return -1;
//                else if (o1.getPriority() == o2.getPriority())
//                return 0;
//                else
//                return 1;
