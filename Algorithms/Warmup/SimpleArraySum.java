import java.io.*;
import java.util.*;

public class SimpleArraySum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        s.nextInt();
        int sum = 0;

        while(s.hasNext()){

            sum+= s.nextInt();

        }

        System.out.println(sum);

    }

}
