public class Cycle {
    private double c;
    private String metric;

    static final double PI = 3.1415;

    public Cycle(double c, String metric) {
        this.c = c;
        this.metric = metric;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    static double inToCm(double in) {
        return   in * 2.54;
    }

    static public double cmToIn(double cm) {
        return cm / 2.54;
    }

    public double perimeterCm() {
        if (metric.equals("cm"))
            return 2 * PI * c;
        else
            return 2 * PI * inToCm(c);
    }

    public double perimeterIn() {
        if (metric.equals("in"))
            return 2 * PI * c;
        else
            return 2 * PI * cmToIn(c);
    }



















}
