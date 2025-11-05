import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ParseDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате ГГГГ.ММ.ДД (например 2025.10.15):");
        String datePart = scanner.nextLine();
        System.out.println("Введите время в формате ЧЧ:ММ (например 14:30):");
        String timePart = scanner.nextLine();
        String[] d = datePart.split("\\.");
        String[] t = timePart.split(":");
        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);
        int hour = Integer.parseInt(t[0]);
        int minute = Integer.parseInt(t[1]);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, hour, minute, 0);
        Date date = cal.getTime();
        System.out.println(cal.get(Calendar.YEAR) + "." 
        + (cal.get(Calendar.MONTH) + 1) + "." 
        + cal.get(Calendar.DAY_OF_MONTH) + " " 
        + cal.get(Calendar.HOUR_OF_DAY) + ":" 
        + cal.get(Calendar.MINUTE));
        System.out.println(date);

    }

    // Вспомогательные методы
    private static boolean isLeapYear(int year) {
        // Грегорианское правило високосного года
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int daysInMonth(int year, int month) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
}
