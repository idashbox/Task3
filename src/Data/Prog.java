package Data;

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        double x = getX();
        double y = getY();
        System.out.println(getColor(x, y));
    }
    public static Scanner scanner = new Scanner(System.in);
    public static final Line L1 = new Line(0,-7, -1);
    public static final VerticalParabola P1 = new VerticalParabola(5, -4, -0.25, 2.5, 41.0/4);

    public static final Сircle C1 = new Сircle(-8, -4, 5);
    public static Colors getColor(double x, double y) {
        if (P1.isPointInParabola(x, y) && L1.isPointAboveLine(x, y)) {
            return Colors.WHITE;
        }
        if (P1.isPointInParabola(x, y) && L1.isPointBelowLine(x, y)) {
            return Colors.BLUE;
        }
        if (P1.isPointNotOnParabola(x, y) && L1.isPointAboveLine(x, y) && C1.isPointNotOnCircle(x, y)) {
            return Colors.BLUE;
        }
        if (L1.isPointAboveLine(x, y) && C1.isPointInCircle(x, y)) {
            return Colors.GRAY;
        }
        if (L1.isPointBelowLine(x, y) && C1.isPointInCircle(x, y)) {
            return Colors.WHITE;
        }
        if (L1.isPointBelowLine(x, y) && C1.isPointNotOnCircle(x, y)) {
            return Colors.GREEN;
        }
        return null;
    }
//    public static void printColorForPoint(double x, double y) {
//        switch ()
//    }
    public enum Colors {
        WHITE,
        GRAY,
        GREEN,
        BLUE;
    }
    static double getX() {
        System.out.println("Введите значение x:");
        double num;
        num = scanner.nextDouble();
        return num;
    }
    static double getY() {
        System.out.println("Введите значение y:");
        double num;
        num = scanner.nextDouble();
        return num;
    }
}
