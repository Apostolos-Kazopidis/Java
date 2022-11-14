class Main {

    public static void main(String[] args) {
        MyClass o = new MyClass();
        MyInterface i;
        SupClass s;

        o.sub();
        o.sup();
        o.inter();

        s = o;
        // s.sub(); // doesn't work
        s.sup();
        // s.sub(); // doesn't work

        i = o;
        // i.sub(); // doesn't work
        // i.sup(); // doesn't work
        i.inter();

    }
}
