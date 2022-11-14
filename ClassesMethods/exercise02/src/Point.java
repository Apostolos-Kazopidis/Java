import java.lang.Math;

class Point {
    int x;
    int y;

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

    Point middle(Point ob){
        Point m = new Point((this.x+ ob.x)/2, (this.y+ob.y)/2);
        return m;
    }
















}
