public class Main {

    public static void main(String[] args) {
        boolean b = true;
        System.out.println(b);
        int i = 4;
        System.out.println(i);
        byte by = (byte)1;
        System.out.println(by);
        char[] s = new char[4];
        s[0] = 's'; s[1] = 't'; s[2] = 'r';
        System.out.println(s);
        System.out.println(s[3]);
        System.out.println(new A());
        System.out.println(new B());
        System.out.println(i+by);
        System.err.println("i" + by);
        System.err.println("i" + "by");
    }
}
