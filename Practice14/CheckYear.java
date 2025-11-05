import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scanner.nextLine();
        Pattern p = Pattern.compile("^((?:31\\/(?:0[13578]|1[02])\\/(?:19\\d{2}|[2-9]\\d{3}))"
                     + "|(?:30\\/(?:0[469]|11)\\/(?:19\\d{2}|[2-9]\\d{3}))"
                     + "|(?:29\\/02\\/(?:(?:(?:19|[2-9]\\d)(?:0[48]|[2468][048]|[13579][26]))|(?:(?:[02468][048]|[13579][26])00)))"
                     + "|(?:(?:0[1-9]|1\\d|2[0-8])\\/02\\/(?:19\\d{2}|[2-9]\\d{3})))$");
        Matcher m = p.matcher(input);
        if (m.find()) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }
    }
}
