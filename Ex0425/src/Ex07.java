import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 25.
 * @time : 오후 5:43:15
 * @content : 예제
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("나이를 말씀해주세요");
		int age = scanner.nextInt();
		System.out.println("인원수를 말씀해주세요");
		int count = scanner.nextInt();

		int t = 5000;
		double tt = 0.5;
		int val = 0;

		if (age > 20) {
			val = t * count;
		} else {
			val = (int) (t * count * tt);
		}

		System.out.println("총" + val + "원 입니다.");

		scanner.close();
	}

}
