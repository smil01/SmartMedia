import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 26.
 * @time : 오후 2:31:43
 * @content : if else
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("월급을 입력하시오. (만원단위)>> ");
		int SALARY = scanner.nextInt();
		int BONUS = 0;
		int grossIncome = 0;

		if (SALARY >= 300) {
			BONUS = 50;
		} else if (SALARY >= 200) {
			BONUS = 30;
		} else if (SALARY >= 100) {
			BONUS = 20;
		}

		grossIncome = SALARY + BONUS;

		System.out.println("이번달 총 소득액은 " + grossIncome + "만원 입니다.");
		
		scanner.close();
	}

}
