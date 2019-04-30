package 페스티벌;

import java.util.Scanner;
/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 4:43:26
 * @content	: 난이도1
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		float num = (float)scanner.nextInt();
		num = num * 0.1f + 0.5f;
		int num2 = (int)num * 10;
		System.out.println("반올림 수 : " + num2);
	}

}
