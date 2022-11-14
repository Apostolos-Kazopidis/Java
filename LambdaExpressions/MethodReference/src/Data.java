public class Data {
    int x;

    public Data(int x) {
        this.x = x;
    }

    void apply(IntFunc ob) {
        x = ob.func(x);
    }

    @Override
    public String toString() {
        return "Data{" + "x=" + x + '}';
    }
}
