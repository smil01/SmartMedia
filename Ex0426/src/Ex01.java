import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 26.
 * @time : 오후 2:05:48
 * @content : else if
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수 입력 >> ");
		int Grade = scanner.nextInt();
		char score;

		if (Grade >= 90) {
			score = 'A';
		} else if (Grade >= 80) {
			score = 'B';
		} else if (Grade >= 70) {
			score = 'C';
		} else {
			score = 'F';
		}

		System.out.println("당신의 학점은 " + score + "입니다.");

		scanner.close();
	}

}
