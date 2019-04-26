import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 26.
 * @time : 오후 3:10:06
 * @content : while
 *
 */
public class Ex04 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		// 입력받은 수가 10보다 작으면 계속 입력,
		// 10보다 큰수를 입력하면 프로그램 종료
		while (true) {
			System.out.print("입력 : ");
			int num = scanner.nextInt();
			if (num > 10) {
				break;
			}
		}

		scanner.close();
	}
}
