class Main {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyData d2 = (MyData) d.copy();
        d.id=1; d.value = 2;
        d.print();
        d2.print();
    }
}
