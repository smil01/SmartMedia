package �佺Ƽ��;

/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 30.
 * @time	: ���� 2:03:17
 * @content	: ���̵� 2
 *
 */
public class Ex02 {

	public static void main(String[] args) { // �޼��� ���� ������ �𸣰����� ������ ������. ģ���ϰ� �����ص帳�ϴ�.
		int number = CollatzNumber(6);
		System.out.println(number);
	}

	public static int CollatzNumber(int num) { // �Լ��� ���鶧 static�� �� ����� main���� ȣ�Ⱑ�� ������ �˰�ʹٸ� ������ ������.
		int count = 0; // ī��Ʈ��
		while (num != 1) { // num�� 1�� �Ǹ� �ڵ����� ����
			count++;
			if (num % 2 == 0) { // ¦�� ����
				num = num / 2; // /=�� ������ �ٲ㵵 ��
			} else { // Ȧ������
				num = num * 3 + 1; // �̰� ���� �ٲٸ� �ȵ�
			}
		}
		return count;
	}

}
