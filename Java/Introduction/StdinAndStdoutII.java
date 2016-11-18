import java.util.Scanner;

public class StdinAndStdoutII {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();

        //removing the end of line character
        scan.nextLine();
        
        String s =  scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
