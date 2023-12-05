package recitations.rec6;

public class NestedCircle {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double radius = 0.5;
        int count = n;
        //StdDraw.setPenRadius(0.02);
        for (int i = 0; i < n; i++) { //create a circle, if circle count is even, make it gray
            if (count%2==0) {
                StdDraw.setPenColor(StdDraw.GRAY);
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
            }
            StdDraw.filledCircle(0.5, 0.5, radius);
            radius -= 0.1;
            count--;
        }
    }
}