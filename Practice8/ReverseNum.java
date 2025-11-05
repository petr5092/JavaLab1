
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        int n = source.nextInt();
        System.out.println(rev(n));
        
    }
    public static String rev(int n) {
            if (n == 0) return "";
            return String.valueOf(n % 10) + rev(n / 10);
        }
    }
