class SampleClass {
    int x;
    int y;

    SampleClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    SampleClass(SampleClass ob) {
        this.x = ob.x;
        this.y = ob.y;
    }

    @Override
    public String toString() {
        return "SampleClass{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleClass that = (SampleClass) o;
        return x == that.x &&
                y == that.y;
    }

}
