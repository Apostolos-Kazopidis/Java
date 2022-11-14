class Main {

    public static void main(String[] args) {
        SupClass s = new MyClass();
        MyClass o;
        //o = s; // doesn't work
        o = (MyClass) s;

    }
}
