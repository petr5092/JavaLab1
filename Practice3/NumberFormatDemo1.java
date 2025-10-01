package Practice3;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatDemo1 {
    public static void main(String[] args) {
        Locale locFR = new Locale("fr");
        Locale.setDefault(Locale.CHINA);
        Scanner source = new Scanner(System.in);
        System.out.println("Введите рубли: ");
        double number = source.nextDouble() / 11;
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance();
        System.out.println("Число в китайской локали: " + numberFormat2.format(number));
    }
}