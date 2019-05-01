
public class Ex03 {
	public static void main(String args[]) {
		System.out.println(cal(50, 15, '-'));
	}
	
	public static int cal(int num, int num2, char op) {
		switch (op) {
		case '+':
			return num + num2;
		case '-':
			return num - num2;
		case '*':
			return num * num2;
		case '/':
			return num / num2;
		default:
			return 0;
		}
	}
}
