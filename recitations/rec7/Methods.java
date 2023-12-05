package recitations.rec7;

public class Methods {
    public static int gcf(int a, int b, int c) {
        int factor = 1;
        int highest = 1;
        while (factor <= a || factor <= b || factor <= c) {
            if (a%factor==0 && b%factor==0 && c%factor==0) {
                highest = factor;
            }
            factor++;
        }
        return highest;
    }
    public static void main(String[] args) {
        System.out.println(gcf(3072, 2560, 960));
    }
}