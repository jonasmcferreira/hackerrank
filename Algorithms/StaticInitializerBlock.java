import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {

	private static boolean flag = true;
	private static int H = 0;
	private static int B = 0;

	static{
	    
	    try{

	        Scanner s = new Scanner(System.in);
	        B = s.nextInt();
	        s.nextLine();
	        H = s.nextInt();

	        if(B <= 0 || H <= 0 ){
	            flag = false;
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	        }    
	    } catch(Exception e ){
	           System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	    
	}

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main

	}//end of class

}