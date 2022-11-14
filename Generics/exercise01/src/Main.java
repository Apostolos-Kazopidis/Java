public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> ml = new MyArrayList<>();

        ml.add(1);
        ml.add(5);
        ml.add(4);
        ml.add(3);
        ml.add(2);

        System.out.println("average: "+ml.avg());

        MyArrayList<Double> ml2 = new MyArrayList<>();

        ml2.add(1.3);
        ml2.add(5.2);
        ml2.add(4.7);
        ml2.add(3.1);
        ml2.add(2.9);

        System.out.println("average: "+ml2.avg());


    }
}