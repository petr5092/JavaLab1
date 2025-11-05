
import java.util.Scanner;

public class ParseNum {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Номер Телефона: ");
    String input = scanner.nextLine();
    System.out.print(input.substring(0, input.length()-7) + 
    "-" + input.substring(input.length()-7, input.length()-4) + 
    "-" + input.substring(input.length()-4));
}
}
