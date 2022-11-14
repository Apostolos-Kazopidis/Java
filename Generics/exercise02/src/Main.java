public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> ut = new MyArrayList<>();
        ut.add(1); ut.add(2); ut.add(3);
        System.out.println(ut.avg());

        MyArrayList<Double> dt = new MyArrayList<>();
        dt.add(1.1); dt.add(2.2); dt.add(3.3);
        System.out.println(dt.avg());

        System.out.println(ut.compareAvg(dt));
    }
}
