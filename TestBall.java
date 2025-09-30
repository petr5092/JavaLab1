import java.util.Scanner;

public class TestBall{
    public static void main(String[] args) {
        Ball first_ball = new Ball();
        System.out.println(first_ball);
        System.out.println("Создайте мячик");
        Scanner source = new Scanner(System.in);
        System.out.println("Создайте x: ");
        double x = source.nextDouble();
        System.out.println("Создайте y: ");
        double y = source.nextDouble();
        Ball second_ball = new Ball(x, y);
        System.out.println(second_ball);
        System.out.println(second_ball.getX());
        System.out.println(second_ball.getY());
        second_ball.setX(22);
        second_ball.setY(22);
        System.out.println(second_ball);
        second_ball.setXY(25, 25);
        System.out.println(second_ball);
    }
}