import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 27.
 * @time : 오전 10:43:43
 * @content : 숫자야구
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3;
		while (true) {
			num1 = random.nextInt(3) + 1;
			num2 = random.nextInt(3) + 1;
			num3 = random.nextInt(3) + 1;

			if (num1 != num2 && num1 != num3 && num2 != num3) {
				break;
			}
		}

		while (true) {
			int s = 0;
			int b = 0;

			System.out.print("첫번째 >>");
			int t_num1 = scanner.nextInt();
			System.out.print("두번째 >>");
			int t_num2 = scanner.nextInt();
			System.out.print("세번째 >>");
			int t_num3 = scanner.nextInt();

			if (num1 == t_num1) {
				s += 1;
			} else if (num1 == t_num2 || num1 == t_num3) {
				b += 1;
			}

			if (num2 == t_num2) {
				s += 1;
			} else if (num2 == t_num1 || num2 == t_num3) {
				b += 1;
			}

			if (num3 == t_num3) {
				s += 1;
			} else if (num3 == t_num1 || num3 == t_num2) {
				b += 1;
			}

			if (s == 3) {
				System.out.println("아웃!!!");
				break;
			} else {
				System.out.println(s + "스트라이크\t" + b + "볼");
			}
		}

	}

}
