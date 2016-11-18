//You are given a date. Your task is to find what the day is on that date.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DateAndTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        Calendar c = Calendar.getInstance();
		//months are 0-11 so we need to subtract one from the value
        c.set(year, month-1, day); 

        
        SimpleDateFormat format = new SimpleDateFormat("EEEE");

        System.out.println(format.format(c.getTime()).toUpperCase());
        
    }
}
