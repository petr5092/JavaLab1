import java.util.Scanner;

public class OnlinePurchase {

    public static void main(String[] args) {
        OnlinePurchase purchase = new OnlinePurchase();
        purchase.processPurchase();
    }

    public void processPurchase() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите ФИО: ");
        String fullName = scanner.nextLine();
        
        System.out.println("Введите номер ИНН: ");
        String inn = scanner.nextLine();
        
        try {
            validateINN(inn);
            System.out.println("Покупка оформлена успешно для клиента: " + fullName);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void validateINN(String inn) throws InvalidINNException {
        if (inn.length() != 12) {
            throw new InvalidINNException("Недействительный ИНН. ИНН должен содержать 12 цифр.");
        }
    }


}
