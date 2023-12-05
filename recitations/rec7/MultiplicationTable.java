package recitations.rec7;

public class MultiplicationTable {
    public static void printTable(int a) {
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                System.out.print(row*col + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTable(5);
    }
}