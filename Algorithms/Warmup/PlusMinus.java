import java.io.*;
import java.util.*;
import java.text.*;

public class PlusMinus {

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        s.nextInt();

        double current, 
            count, 
            negative, 
            positive, 
            zeroes;
        
        current = count = negative = positive = zeroes = 0;
        
        while(s.hasNext()){
        
            current = s.nextInt(); 
        
            if(current < 0){
        
                negative++;
        
            } else if ( current == 0){
        
                zeroes++;
        
            } else {
        
                positive++;
        
            }
        
            count++;
        
        }
        
        DecimalFormat df = new DecimalFormat("#0.000000");
        
        System.out.println(df.format(positive/count));
        System.out.println(df.format(negative/count));
        System.out.println(df.format(zeroes/count));
        
    }

}
