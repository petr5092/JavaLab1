import java.util.Stack;

public class PolCalculator {

	public static double evalRPN(String expr) {
		if (expr == null) throw new IllegalArgumentException("Выражение равно null");
		expr = expr.trim();
		if (expr.isEmpty()) throw new IllegalArgumentException("Выражение пустое");

		String[] tokens = expr.split(" ");
		Stack<Double> stack = new Stack<>();

		for (String token : tokens) {
			if (token.isEmpty()) continue;
			if (isOperator(token)) {
				if (stack.size() < 2) throw new IllegalArgumentException("Невозможно выполнить POP для пустого стека");
				double b = stack.pop();
				double a = stack.pop();
				double r;
				switch (token) {
					case "+": r = a + b; break;
					case "-": r = a - b; break;
					case "*": r = a * b; break;
					case "/":
						if (b == 0) throw new IllegalArgumentException("Деление на ноль");
						r = a / b; break;
					default: throw new IllegalArgumentException("Неизвестный оператор: " + token);
				}
				stack.push(r);
			} else {
				try {
					stack.push(Double.parseDouble(token));
				} catch (NumberFormatException e) {
					throw new IllegalArgumentException("Неверный токен: '" + token + "'");
				}
			}
		}

		if (stack.size() != 1) throw new IllegalArgumentException("Неверное RPN-выражение: в стеке остались элементы");
		return stack.pop();
	}

	private static boolean isOperator(String t) {
		return "+".equals(t) || "-".equals(t) || "*".equals(t) || "/".equals(t);
	}
}
