import java.lang.Math;

class Main {

    public static void main(String[] args) {
        Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(2,0));
        t.draw();
        System.out.println("Perimeter: " + t.perimeter());

        EquilateralTriangle t2 = new EquilateralTriangle(new Point(0,0), new Point(1,Math.sqrt(3)), new Point(2,0));
        System.out.println(t2.checkEquilateral());
    }
}
