import java.lang.Math;

class Point {
    private double x;
    private double y;

    Point() {
        x=0;
        y=0;
    }

    Point(Point ob) {
        x=ob.x;
        y=ob.y;
    }

    Point(double diag) {
        this.x=diag;
        this.y=diag;
    }

    Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    void set(double x, double y) {
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
