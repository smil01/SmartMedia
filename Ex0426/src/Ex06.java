import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 26.
 * @time : 오후 3:41:07
 * @content : while문 문제
 *
 */
public class Ex06 {
	public static void main(String args[]) {
		int now = 0, goal = 0, count = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		now = scanner.nextInt();
		System.out.print("목표 몸무게 : ");
		goal = scanner.nextInt();

		while (now > goal) {
			System.out.print(++count + "주차 감량 몸무게 : ");
			now -= scanner.nextInt();
		}

		System.out.println(now + "kg 달성!! 축하합니다!");

		scanner.close();
	}
}
