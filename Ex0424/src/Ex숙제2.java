import java.util.Scanner;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 24.
 * @time	: 오후 6:17:22
 * @content	: 숙제2
 *
 */
public class Ex숙제2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("초 입력 >>");
		int totalSecond = scanner.nextInt();

		int hour = totalSecond / 3600;
		totalSecond = totalSecond % 3600;

		int minutes = totalSecond / 60;

		int second = totalSecond % 60;

		System.out.println(hour + "시" + minutes + "분" + second + "초");
	}

}
