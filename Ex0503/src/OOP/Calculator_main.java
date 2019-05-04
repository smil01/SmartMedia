package OOP;

import java.util.Scanner;

public class Calculator_main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� >>");
		int num1 = scanner.nextInt();

		System.out.print("�ι�° ���� �Է� >>");
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
			System.out.println("��� >>" + num1 + "/" + num2 + "=" + cal.div());
			break;
		}
	}

}
