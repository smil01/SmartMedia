package �佺Ƽ��;
/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 30.
 * @time	: ���� 3:50:55
 * @content	: ���̵� 1
 *
 */
public class Ex07 {
	
	public static int findKim(String[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("Kim")) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] name = {"Qeskajdl", "sakdjsak", "Kim"};
		System.out.println("�輭���� "+ findKim(name) + "�� �ֽ��ϴ�.");
	}

}
