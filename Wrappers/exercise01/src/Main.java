public class Main {
    public static void main(String[] args) {
        Object[] array = new Object[4];

        array[0] = 2;
        array[1] = 2.1;
        array[2] = true;
        array[3] = "string";

        for(var i: array)
            System.out.println(i);


    }
}