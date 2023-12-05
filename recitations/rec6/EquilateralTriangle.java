package recitations.rec6;

public class EquilateralTriangle {
    public static void main(String[] args) {
        double h = Math.sqrt(3.0) / 2.0;
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, h);
        StdDraw.line(0.5, h, 0.0, 0.0);
    }
}