package Data;

public class Сircle {
    public double x0;
    public double y0;
    public double r;
    public Сircle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }
    public boolean isPointInCircle(double x, double y) {
        return (((x - x0) * (x - x0) + (y - y0) * (y - y0)) <= r * r);
    }
//    public boolean isPointOnCircle(double x, double y) {
//        return (((x - x0) * (x - x0) + (y - y0) * (y - y0)) == r * r);
//    }
    public boolean isPointNotOnCircle(double x, double y) {
        return (((x - x0) * (x - x0) + (y - y0) * (y - y0)) >= r * r);
    }
}
