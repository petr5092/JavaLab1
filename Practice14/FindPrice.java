import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scanner.nextLine();
        Pattern p = Pattern.compile("\\b(\\d+(?:\\.\\d{1,9})?)\\s*(USD|RUB|EU)\\b");
        Matcher m = p.matcher(input);
        boolean found = false;
        while (m.find()) {
            System.out.println(m.group(1) + " " + m.group(2).toUpperCase());
            found = true;
        }
        if (!found) {
            System.out.println("Не найдено");
        }
    }
}
