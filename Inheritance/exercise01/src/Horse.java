public class Horse extends Animal {
    private String color;
    private int tail;

    public Horse(int weight, int height, String color, int tail) {
        super(weight, height);
        this.color = color;
        this.tail = tail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
}
