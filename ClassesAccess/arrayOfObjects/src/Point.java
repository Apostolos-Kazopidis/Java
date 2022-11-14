import java.lang.Math;

class Point {
    private int x;
    private int y;

    Point() {
        x=0;
        y=0;
    }

    Point(Point ob) {
        x=ob.x;
        y=ob.y;
    }

    Point(int diag) {
        this.x=diag;
        this.y=diag;
    }

    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double length() {
        double len = Math.sqrt(x*x+y*y);
        return len;
    }

    Point middle(Point ob) {
        return new Point((this.x + ob.x)/2, (this.y + ob.y)/2);
    }

    void print() {
        System.out.println("(" + x + "," + y +")");
    }
}
