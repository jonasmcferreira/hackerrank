
import java.io.*;
import java.util.*;

public class Staircase {

	public static void main(String[] args) {

		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner s   = new Scanner(System.in);
		int n  = s.nextInt();

		for (int i = 0; i < n ; i++) {

			for (int j = n - 1; j >= 0 ; j--) {

				if (i >= j) {

					System.out.print("#");

				} else {

					System.out.print(" ");

				}

			}

			System.out.println("");

		}

	}

}