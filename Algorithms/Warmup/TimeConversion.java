import java.io.*;
import java.util.*;
import java.text.*;

public class TimeConversion {

    public static void main(String[] args) throws Exception{
        
        Scanner s = new Scanner(System.in);
        String time = s.nextLine();
        
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        
        //beware, this might throw an exception
        Date date = parseFormat.parse(time);
        
        System.out.println(displayFormat.format(date));
    
    }

}