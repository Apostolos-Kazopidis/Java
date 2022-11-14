import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1,2};
        String[] array2 = {"test1", "test2"};

        ArrayList<Integer> al = ArrayListAux.toArrayList(array);
        System.out.println(al);

        ArrayList<String> al2 = ArrayListAux.toArrayList(array2);
        System.out.println(al2);
    }
}
