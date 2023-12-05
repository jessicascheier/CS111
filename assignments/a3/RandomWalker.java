package assignments.a3;
/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Jessica Scheier, jls772@scarletmail.rutgers.edu, jls772
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        System.out.println("(0, 0)");
        for (int i = 0; i < n; i++) {
            double r = Math.random();
            if (r <= 0.25) {
                x += 1;
            } else if (r <= 0.50) {
                x -= 1;
            } else if (r <= 0.75) {
                y += 1;
            } else {
                y -= 1;
            }
            String location = "(" + x + ", " + y + ")";
            System.out.println(location);
        }
        double squaredDistance = ((x*x) + (y*y));
        System.out.println("Squared distance = " + squaredDistance);
	// WRITE YOUR CODE HERE
    }
}
