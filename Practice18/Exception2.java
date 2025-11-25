import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        exceptionDemo();
    }
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        try {
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch ( Exception e ) { 
            if (e instanceof NumberFormatException) {
                System.out.println("Invalid integer format");
            } else if (e instanceof ArithmeticException) {
                System.out.println("Attempted division by zero");
            } else {
                System.out.println("An exception occurred: " + e);
            }
        } finally {
            myScanner.close();
        }
    }
}