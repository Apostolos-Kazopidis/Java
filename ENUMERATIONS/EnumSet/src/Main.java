import java.util.EnumSet;

class Main {

    public static void main(String[] args) {
        EnumSet<Month> es = EnumSet.of(Month.FEBRUARY, Month.MARCH);

        es.add(Month.APRIL);
        es.add(Month.MAY);

        for (var v: es)
            System.out.println(v);

    }
}
