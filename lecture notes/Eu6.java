public class Eu6 {
    public static void main(String[] args) {
        int sos = 0; //sum of squares
        int limit = Integer.parseInt(args[0]);
        for (int i = 0; i <= limit; i++) {
            sos = sos + i*i;
        }
        System.out.println(sos);
        
        int sqos = 0; //square of sums
        for (int i = 0; i <= limit; i++) {
            sqos = sqos + i;
        }
        sqos = sqos * sqos;
        System.out.println(sqos);
        System.out.println(sqos - sos); //difference
    }
}