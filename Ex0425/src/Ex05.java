import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 25.
 * @time : 오후 4:26:17
 * @content : 문제
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		int db, keisan, os, data, soft, sum;

		Scanner scanner = new Scanner(System.in);

		System.out.print("DB : ");
		db = scanner.nextInt();

		System.out.print("전자계산기 구조 : ");
		keisan = scanner.nextInt();

		System.out.print("OS : ");
		os = scanner.nextInt();

		System.out.print("데이터통신 : ");
		data = scanner.nextInt();

		System.out.print("소프트웨어공학 : ");
		soft = scanner.nextInt();

		
		sum = db + keisan + os + data + soft;
		

		if (db > 7 && keisan > 7 && os > 7 && data > 7 && soft > 7 && sum > 59) {
			System.out.println("합격입니다!!!!!!");
		} else {
			System.out.println("불합격입니다!!!!!");
		}

	}

}
