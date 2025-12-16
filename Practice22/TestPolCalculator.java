public class TestPolCalculator {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        assertEquals("3 4 +", 7.0, PolCalculator.evalRPN("3 4 +"));
        assertEquals("5 1 2 + 4 * + 3 -", 14.0, PolCalculator.evalRPN("5 1 2 + 4 * + 3 -"));
        assertEquals("10 2 /", 5.0, PolCalculator.evalRPN("10 2 /"));
        assertEquals("3.5 2 *", 7.0, PolCalculator.evalRPN("3.5 2 *"));
        assertThrows("1 2 + *", "1 2 + *", "Невозможно выполнить POP для пустого стека");
        assertThrows("1 +", "1 +", "Невозможно выполнить POP для пустого стека");
        assertThrows("a b +", "a b +", "Неверный токен: 'a'");
        assertThrows("4 0 /", "4 0 /", "Деление на ноль");
        assertThrows("", "", "Выражение пустое");
        assertThrows("leftover", "1 2", "Неверное RPN-выражение: в стеке остались элементы");

        System.out.printf("\nПройдено: %d, Провалено: %d\n", passed, failed);
        if (failed > 0) System.exit(1);
    }

    private static void assertEquals(String name, double expected, double actual) {

        double eps = 1e-9;
        if (Math.abs(expected - actual) <= eps) {
            System.out.printf("УСПЕШНО: %s => %s\n", name, actual);
            passed++;
        } else {
            System.out.printf("ОШИБКА: %s => ожидалось %s, но получено %s\n", name, expected, actual);
            failed++;
        }
    }

    private static void assertThrows(String name, String expr, String expectedMessage) {
        try {
            PolCalculator.evalRPN(expr);
            System.out.printf("ОШИБКА: %s => ожидалось исключение '%s', но исключение не было выброшено\n", name, expectedMessage);
            failed++;
        } catch (IllegalArgumentException e) {
            String msg = e.getMessage();
            if (expectedMessage.equals(msg)) {
                System.out.printf("УСПЕШНО: %s => выброшено '%s'\n", name, msg);
                passed++;
            } else {
                System.out.printf("ОШИБКА: %s => ожидалось сообщение '%s', но получено '%s'\n", name, expectedMessage, msg);
                failed++;
            }
        } catch (Exception e) {
            System.out.printf("ОШИБКА: %s => ожидалось IllegalArgumentException, но получено %s: %s\n", name, e.getClass().getSimpleName(), e.getMessage());
            failed++;
        }
    }
}