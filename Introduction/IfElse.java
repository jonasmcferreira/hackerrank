import java.io.*;
import java.util.*;
import java.text.*;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="Not Weird";

        if(n%2==1){
        
          ans = "Weird";
        
        } else{
        
           if(n >= 6 && n <= 20){
               ans = "Weird";
           }
            
        }

        System.out.println(ans);
        
    }
}
