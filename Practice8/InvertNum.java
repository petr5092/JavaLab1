import java.util.Scanner;

public class InvertNum {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("Создайте n: ");
        int n = source.nextInt();
        int res = invert(n, 0);
        System.out.println(res);

    }

    public static int invert(int n, int answer){
        if (n == 0) {
            return answer;
            
        }
        return invert(n / 10, answer * 10 + n % 10);
    }
}
