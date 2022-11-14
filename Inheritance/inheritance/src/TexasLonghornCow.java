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
}
