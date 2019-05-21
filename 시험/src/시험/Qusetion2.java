package 시험;

import java.util.Scanner;

public class Qusetion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result[] = {0,0};
		int input = 0;
		
		while (true) {
			System.out.print("숫자 입력 >> ");
			input = sc.nextInt();
			
			if(input == 0) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			} else if(input % 2 == 0) {
				result[0] += 1;
			} else {
				result[1] += 1;
			}
			
			System.out.println("짝수 개수 : " + result[0]);
			System.out.println("홀수 개수 : " + result[1]);
		}

	}

}
