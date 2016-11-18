import java.util.*;
import java.io.*;

class LoopsII{
    
    public static void main(String []argh){
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0 ; i < t ; i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int count = 1;
            while(count <= n){
                
                System.out.print(calculation(count,a,b)+" ");
                count++;

            }

            System.out.print("\n");
        
        }

        in.close();
    }
    
    public static int calculation(int n, int a, int b){
        
        if(n < 1){

          return a;

        } else {

          n--;
          return  calculation(n, a, b) + (int)(Math.pow(2,n) * b);

        } 
            
    }
}
