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

    void print(){
        System.out.println("To simeio einai ("+x+","+y+")");
    }

}
