import java.lang.Math;

class Point {
    int x;
    int y;

    Point() {
        x=0;
        y=0;
    }

    Point(int diag) {
        this.x=diag;
        this.y=diag;
    }

    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double length() {
        double len = Math.sqrt(x*x+y*y);
        return len;
    }

    void print() {
        System.out.println("(" + x + "," + y +")");
    }
}
