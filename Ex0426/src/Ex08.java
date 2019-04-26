import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 26.
 * @time : 오후 4:34:03
 * @content : 문제
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int num = random.nextInt(20)+1;
		int input = 0;
		System.out.println("랜덤 생성 : " + num);
		

		while (num != input) {
			System.out.print("number : ");
			input = scanner.nextInt();

			if (num > input) {
				System.out.println("Up");
			} else if (num < input) {
				System.out.println("Down");
			}
		}
		
		System.out.println("Success");
	}

}
