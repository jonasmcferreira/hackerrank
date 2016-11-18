
import java.io.*;
import java.util.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        s.nextInt();
        long sum = 0;
        
        while(s.hasNext()){
        
            int current = s.nextInt();
            sum += current;
            
        }
        
        System.out.println(sum);

    }
    
}