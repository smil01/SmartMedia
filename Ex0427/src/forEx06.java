
/**
 * 
 * @author : �����
 * @date : 2019. 4. 27.
 * @time : ���� 4:39:45
 * @content : ������ (�ڱ� �ڽ��� ������ ����� ���� �ڱ� �ڽ��� ���� ���� ��������� �Ѵ�.)
 *
 */
public class forEx06 {

	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}

			if (i == sum) {
				System.out.println(i);
			}
		}
	}

}
