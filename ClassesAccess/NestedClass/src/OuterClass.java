class OuterClass {
    private int x = 0;

    class NestedClass {
        private int y = 1;

        void testNested() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    void testOuter() {
        NestedClass n = new NestedClass();
        n.testNested();
    }
}
