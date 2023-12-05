package recitations.rec4;
public class summation {
    public static void main(String[] args) {
        /*
        int x = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
        
        int x = Integer.parseInt(args[0]);
        int i = 1;
        int sum = 0;
        while (i <= x) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        */

        int x = Integer.parseInt(args[0]);
        int i = 0;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= x);
        System.out.println(sum);
    }
}
