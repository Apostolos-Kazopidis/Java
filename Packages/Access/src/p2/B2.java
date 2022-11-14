package p2;

import p1.A1;

public class B2 {
    A1 ob;

    public B2() {
        this.ob = new A1();
    }

    @Override
    public String toString() {
        return "B2 {" +
                // "pri=" + ob.pri + // doesn't work
                ", pub=" + ob.pub +
                // ", nomod=" + ob.nomod + // doesn't work
                // ", pro=" + ob.pro + // doesn't work
                '}';
    }
}
