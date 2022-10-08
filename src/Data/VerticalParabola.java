package Data;

public class VerticalParabola {
    public double x0;
    public double y0;
    public double a;
    public double b;
    public double c;
    public VerticalParabola(double x0, double y0, double a, double b, double c) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isPointInParabola(double x, double y) {
        return y <= a * Math.pow(x - x0, 2) + y0 + b * (x - x0) + c;
    }
//    public boolean isPointOnParabola(double x, double y) {
//        return y == a * Math.pow(x - x0, 2) + y0;
//    }
    public boolean isPointNotOnParabola(double x, double y) {
        return y >= a * Math.pow(x - x0, 2) + y0;
    }
}
