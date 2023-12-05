package recitations.rec4;
public class Speed {
    public static void main(String[] args) {
        int speed = Integer.parseInt(args[0]);
        String fine = "$";
        if (speed <= 60) {
            System.out.println(fine + 0);
        } else if (speed > 60 && speed <= 75) {
            System.out.println(fine + 100);
        } else if (speed > 75 && speed <= 90) {
            System.out.println(fine + 200);
        } else {
            System.out.println(fine + 500);
        }
    }
}