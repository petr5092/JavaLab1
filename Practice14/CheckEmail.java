import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scanner.nextLine();
        Pattern p = Pattern.compile("^(?:[\\w.+-]+@(?:localhost|(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,6}))$");
        Matcher m = p.matcher(input);
        if (m.find()) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }
    }
}
