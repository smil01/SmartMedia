
/**
 * 
 * @author : �����
 * @date : 2019. 4. 27.
 * @time : ���� 4:17:31
 * @content : 2~30������ ����� ���ϼ���.
 *
 */
public class forEx05 {

	public static void main(String[] args) {

		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "�� ��� : ");
			System.out.println();
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
		}
	}

}
