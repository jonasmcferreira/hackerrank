
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoopsI {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int i = 1;
        
        while( i<=10 ){
        
            System.out.println(N+" x "+i+" = "+ N*i);
        
            i++;
        
        }
    }
}
