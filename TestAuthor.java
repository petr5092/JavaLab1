import java.util.Scanner;

public class TestAuthor{
    public static void main(String[] args) {
        System.out.println("Создайте автора");
        Scanner source = new Scanner(System.in);
        System.out.println("Создайте имя: ");
        String new_name = source.nextLine();
        System.out.println("Создайте почту: ");
        String new_email = source.nextLine();
        System.out.println("Создайте пол: ");
        String new_gender = source.nextLine();
        Author test_author = new Author(new_name, new_email, new_gender.charAt(0));
        System.out.println(test_author);
        System.out.println(test_author.getEmail());
        System.out.println(test_author.getName());
        System.out.println("gender: " + test_author.getGender());
        test_author.setEmail("aboba");
        System.out.println(test_author);
    }
}