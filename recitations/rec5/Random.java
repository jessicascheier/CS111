package recitations.rec5;

public class Random {
    public static void main(String[] args) {
        int n = 5;
        int random = (int) (Math.random() * (n + 1));
        System.out.println(random);
    }
}