import java.util.Scanner;

public class OddNum {
    public static void main() {
        Scanner source = new Scanner(System.in);
        System.out.println("Создайте n: ");
        int n = source.nextInt();
        if (n == 0){
            return;
        }
        if (n % 2 != 0){
            System.out.println(n);
        }
        main();
    }
}
