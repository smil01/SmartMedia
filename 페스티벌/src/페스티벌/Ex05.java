package �佺Ƽ��;

public class Ex05 {

	public static String change124(int n) { // �Լ��� ���鶧 static�� �� ����� main���� ȣ�Ⱑ�� ������ �˰�ʹٸ� ������ ������.
		String answer = "";
        int[] arr = {4, 1, 2}; // �ݺ���
        int a; // �ߺ��ؼ� �� ��
        while (n > 0) {
            a = n % 3; // 3���� ������ �������� ù��° ���ڷ� ��
            n = n / 3; // �� ���� �ڸ��� ������ ���� �ߺ��� ó������
            if (a == 0) {
                n -= 1;
            }
            answer = arr[a] + answer;
        }
        return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(change124(10));
	}

}
