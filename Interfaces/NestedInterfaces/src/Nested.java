class Nested {
    interface Interface {
        void f();
    }

    class NestedClass implements Interface {
        int x;

        @Override
        public void f() {
            System.out.println("Overriden interface method");
        }
    }

    void g() {
        NestedClass n = new NestedClass();
        n.f();
    }
}
