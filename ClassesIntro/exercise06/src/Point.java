import static java.lang.Math.sqrt;

public class Point {
    int x,y;

    Point(){
        x=0;
        y=0;
    }

    void set(int x, int y){
        this.x = x;
        this.y= y;
    }

    double distance_method(){
        double distance;
        distance = (sqrt(x*x+y*y));
        return distance;
    }

    void print(){
        System.out.println("To simeio einai ("+x+","+y+")");
    }

}
