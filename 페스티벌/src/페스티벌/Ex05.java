package �佺Ƽ��;

public class Ex05 {

	public static String change124(int n) { // �Լ��� ���鶧 static�� �� ����� main���� ȣ�Ⱑ�� ������ �˰�ʹٸ� ������ ������.
		String answer = "";
        int[] arr = {4, 1, 2};
        int a;
        while (n > 0) {
            a = n % 3;
            n = n / 3;
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
