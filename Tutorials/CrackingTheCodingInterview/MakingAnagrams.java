import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnagrams {
	
	public static int numberNeeded(String first, String second) {

		int[] frequency = new int[26];
		
		first.chars().forEach((c) -> {
			frequency[c - 97]++;
		});

		second.chars().forEach((c) -> {
			frequency[c - 97]--;
		});

		return Arrays.stream(frequency).map(Math::abs).sum();

	}

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
	
		System.out.println(numberNeeded(a, b));
	
	}

}
