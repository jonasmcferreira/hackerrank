import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day3IntroToConditionalStatements {
   
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();

      String ans="Weird";
          
      if(n%2==0 && (n < 6 || n > 20)){
         ans="Not Weird";
      }

      System.out.println(ans);

   }

}
