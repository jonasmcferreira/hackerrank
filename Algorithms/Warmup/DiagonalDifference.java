
import java.io.*;
import java.util.*;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int first = 0;
		int second = 0;

		int[][] matrix = new int[n][n];

		for (int row = 0 ; row < n; row++) {
		
			for (int col = 0 ; col < n; col++) {
		
				matrix[col][row] = s.nextInt();
		
			}
		
		}

		int j = 0;
		int k = n - 1;
		
		for (int i = 0; i < n ; i++) {
		
			first += matrix[i][j];
			second += matrix [i][k];
			j++;
			k--;
		
		}
		
		System.out.println(Math.abs(first - second));
	}
	
}