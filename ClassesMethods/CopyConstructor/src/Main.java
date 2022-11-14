class Main {

    public static void main(String[] args) {
	    Point p1 = new Point(1,5);
	    p1.print();
	    Point p2 = new Point(p1);
	    p1.set(5,8);
	    p1.print();
	    p2.print();
    }
}
