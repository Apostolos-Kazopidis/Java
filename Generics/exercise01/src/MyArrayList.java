import java.util.ArrayList;

public class MyArrayList<T extends Number>{

    ArrayList<T> array;

    MyArrayList() {
        array = new ArrayList<>();
    }

    public void add(T elem) {
        array.add(elem);
    }

    public double avg() {

        if(array.isEmpty())
            return 0;

        double a= 0.0;

        for(var elem: array) {
            a = a + elem.doubleValue();
        }

        return a/ array.size();
    }







}
