import assignments.a6.StdOut;

public class PQfunctions1a {
    public static int cube(int i) {
        return i * i * i;
    }
    public static void main(String[] dogs) {
        int N = Integer.parseInt(dogs[0]);
        for (int i = 1; i <= N; i++) {
            StdOut.println(i + " " + cube(i));
        }
    }
}