class Main {
    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.func(1);
        p.func(2.4);
        p.func(3, 1.1);
        int x = 1, y = 2;
        p.func(x, y);
    }
}
