
/**
 * 
 * @author : �����
 * @date : 2019. 4. 29.
 * @time : ���� 3:01:16
 * @content : ���� �� ���ﰢ�� ���
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < i; j++) {
		// System.out.print(" ");
		// }
		// for (int j = 0; j < 5 - i; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((i <= j) ? "*" : " ");
			}
			System.out.println();
		}

	}

}
