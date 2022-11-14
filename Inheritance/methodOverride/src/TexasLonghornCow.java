class TexasLonghornCow extends Cow {
    private double hornLength;

    TexasLonghornCow(int weight, int hunger, double hornLength) {
        super(weight, hunger);
        this.hornLength = hornLength;
    }

    public double getHornLength() {
        return hornLength;
    }

    public void setHornLength(double hornLength) {
        this.hornLength = hornLength;
    }

    public void express() {
        if (getHunger() > 5)
            System.out.println("MoEEEEooooEEEwEEww");
        else
            System.out.println("MoeEEeooww");
    }
}
