import java.util.Scanner;

public class CounterUnit {

    public static int main() {
        Scanner source = new Scanner(System.in);
        System.out.println("Создайте n: ");
        int n = source.nextInt();
        if (n == 0) {
            System.out.println("Создайте n: ");
            int next_n = source.nextInt();
            if (next_n == 0){
                return 0;
            }
            else{
                if (next_n == 1) {
                    return 1 + main();
                }
                else{
                    return main();
                }
            }
            
        }
        if (n == 1) {
                return 1 + main();
        }
        else{
            return main();
        }
    }
    
}
