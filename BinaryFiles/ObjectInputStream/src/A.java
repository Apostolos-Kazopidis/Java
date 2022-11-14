import java.io.Serializable;

public class A implements Serializable {
    int x;
    double y;
    String s;

    public A(int x, double y, String s) {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", y=" + y +
                ", s='" + s + '\'' +
                '}';
    }
}
