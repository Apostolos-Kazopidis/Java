public class A<T> {
    T elem;

    public A(T elem) {
        this.elem = elem;
    }

    public A(Class<T> cls) {
        try {
            elem = cls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
        elem = null;
    }

    @Override
    public String toString() {
        return "A{" +
                "elem=" + elem +
                '}';
    }
}
