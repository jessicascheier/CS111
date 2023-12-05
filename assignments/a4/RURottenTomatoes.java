package assignments.a4;
/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Jessica Scheier, jls772@scarletmail.rutgers.edu, jls772
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);

		int[][] movieRatings = new int[rows][cols]; //2d array created
		int start = 2; //after first two arguments

		for (int i = 0; i < rows; i++) { //assign command line args to 2d array
			for (int j = 0; j < cols; j++) {
				movieRatings[i][j] = Integer.parseInt(args[start]); //row major order
				start++;
			}
		}

		int sum = 0;
		int index = 0;

		for (int i = 0; i < cols; i++)  { //calculate the sum of each column using a loop
			int check = 0;
			for (int j = 0; j < rows; j++) {
				check += movieRatings[j][i]; // col major order
			}
			if (check > sum) { //get highest sum
				sum = check;
				index = i;
			}
		}
		System.out.println(index);
	}
}