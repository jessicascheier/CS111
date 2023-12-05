package recitations.rec7;

public class Atoi {
    public static void atoi(String x) {
        int ascii = 0;
        for (int i = 0; i < x.length(); i++) {
            ascii = (int) x.charAt(i);
            System.out.print(ascii + " ");
        }
    }
    public static void main(String[] args) {
        atoi("String");
    }
}