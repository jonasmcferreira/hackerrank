import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraysLeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];

		//just calculate where each number would be after k rotations
        for(int a_i=0; a_i < n; a_i++){

            a[(a_i + n - k)%n] = in.nextInt();

        }

        System.out.println(Arrays.toString(a).replaceAll("\\[", "").replaceAll("\\]","").replaceAll(",",""));
        
    }
    
    
}
