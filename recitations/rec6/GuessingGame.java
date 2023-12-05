package recitations.rec6;

public class GuessingGame {
    public static void main(String[] args) {
        int random = (int) (Math.random() * (1000 - 1)) + 1;
        //1 + (int) (Math.random()*1000)
        int guess = 0;
        while (guess != random) {
            StdOut.print("Guess my number: ");
            guess = StdIn.readInt();
            if (guess < random) {
                StdOut.println("Too low!");
            }
            if (guess > random) {
                StdOut.println("Too high!");
            }
        }
        StdOut.println("You win!");
    }
}