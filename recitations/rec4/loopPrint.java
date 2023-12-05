package recitations.rec4;
public class loopPrint {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i + ",");
        }
    }
}