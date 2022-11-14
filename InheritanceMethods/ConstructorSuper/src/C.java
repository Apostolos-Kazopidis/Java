class C extends B {
    int c;

    C(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("Constructing C..");
    }
}