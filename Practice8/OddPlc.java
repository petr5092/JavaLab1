import java.util.Scanner;

public class OddPlc {
    public static void main(String[] args) {
        odd();
    }

    public static void odd() {
        Scanner source = new Scanner(System.in);
        int n = source.nextInt();
        if (n == 0){
            return;
        }
        System.out.println("     " + n);
        int next = source.nextInt();
        if (next == 0) {
            return;
        }
        odd();
    }
}
