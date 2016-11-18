import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String result = "No";
        
        int l = A.length();
        
        if(l%2 == 1){
        
           String firstHalf = A.substring(0,l/2+1);

        } else {
        
           String firstHalf = A.substring(0,l/2);
           
        
        }
        
        String secondHalf = A.substring(l/2,l);
        String secondHalfReversed = new StringBuilder(secondHalf).reverse().toString();

        if(firstHalf.equals(secondHalfReversed)){
          result = "Yes";
        }
            
        System.out.println(result);
    }
}
 