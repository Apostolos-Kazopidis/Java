package p1;

public class A3 {
    A1 ob;

    public A3() {
        this.ob = new A1();
    }

    @Override
    public String toString() {
        return "A3 {" +
                // "pri=" + ob.pri + // doesn't work
                ", pub=" + ob.pub +
                ", nomod=" + ob.nomod +
                ", pro=" + ob.pro +
                '}';
    }
}
