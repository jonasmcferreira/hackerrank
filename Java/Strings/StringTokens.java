
import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        
        if(s.length() == 0){
        
          System.out.println("0");  
        
        } else if (s.length() > 400000){
             
        } else {
        
            String[] result = s.split("[ !,?._'@]+");
        
            System.out.println(result.length);
        
            for (int x=0; x<result.length; x++) {
        
              System.out.println(result[x]);
        
            }    
        
        }
        
        scan.close();
    }
}
