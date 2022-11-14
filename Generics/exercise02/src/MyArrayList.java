import java.util.ArrayList;

public class MyArrayList<T extends Number> {
    private ArrayList<T> array;

    MyArrayList() {
        array = new ArrayList<>();
    }

    public void add(T elem) {
        array.add(elem);
    }

    public double avg() {
        if (array.isEmpty())
            return 0;

        double a = 0.0;
        for (var elem: array)
            a+=elem.doubleValue();
        return a/array.size();
    }

    public <H extends Number> int compareAvg(MyArrayList<H> ma) {
        return Double.compare(avg(),ma.avg());
    }
























}
