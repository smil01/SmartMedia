import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = scanner.nextInt();
		
		int result = bigyo(num1, num2);
		
		System.out.println("결과 확인 : " + result);
	}

	public static int bigyo(int num1, int num2) {
		int result = num1 - num2;

		if(result < 0) {
			result = -result;
		}

		return result;
	}

}
