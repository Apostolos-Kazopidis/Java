public class Main {
    public static void main(String[] args) {
        Data d = new Data(5);

        d.apply(Utils::aStatic);
        System.out.println(d);

        Utils utilsOb = new Utils();
        d.apply(utilsOb::aMethod);
        System.out.println(d);
    }
}

