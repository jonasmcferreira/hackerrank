
import java.io.*;
import java.util.*;

public class Anagrams {

	private static boolean isAnagram(String a, String b) {

		char[] ar = a.toLowerCase().toCharArray();
		char[] br = b.toLowerCase().toCharArray();

		Arrays.sort(ar);
		Arrays.sort(br);

		return Arrays.equals(ar, br);


	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}