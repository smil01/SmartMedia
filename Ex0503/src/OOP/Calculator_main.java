package OOP;

import java.util.Scanner;

public class Calculator_main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력 >>");
		int num1 = scanner.nextInt();

		System.out.print("두번째 숫자 입력 >>");
		int num2 = scanner.nextInt();

		System.out.print("+, -, *, / >>");
		String op = scanner.next();

		Calculator cal = new Calculator(num1, num2, op);

		switch (cal.getOp()) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + cal.sum());
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + cal.sub());
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + cal.mul());
			break;
		case "/":
			System.out.println("결과 >>" + num1 + "/" + num2 + "=" + cal.div());
			break;
		}
	}

}
