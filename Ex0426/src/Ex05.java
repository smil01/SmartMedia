import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 26.
 * @time : 오후 3:23:49
 * @content : while문 문제
 *
 */
public class Ex05 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;

		while (num < 50) {
			System.out.print("숫자 입력 >> ");
			num += scanner.nextInt();
		}

		System.out.println("50을 초과 >> " + num);
		scanner.close();
	}
}
