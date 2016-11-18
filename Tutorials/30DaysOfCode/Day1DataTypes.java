import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1DataTypes {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int myI = scan.nextInt();
		scan.nextLine();

		double myD = scan.nextDouble();
		scan.nextLine();

		String myS = scan.nextLine();

		System.out.println(i + myI);
		System.out.println(d + myD);
		System.out.println(s + myS);


		scan.close();
	}
}