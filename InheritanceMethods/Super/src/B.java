class B extends A {
    int a=20;

    void f() {
        System.out.println("fB: a=" + a);
        System.out.println("fB: a=" + super.a);
        super.f();
    }
}
