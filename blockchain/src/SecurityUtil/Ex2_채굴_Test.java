package SecurityUtil;

import SecurityUtil.SHA256.SHA256Salt;
/**
 * 
 * @author	: �����
 * @date	: 2019. 5. 9.
 * @time	: ���� 2:16:57
 * @content	: ä�� �⺻ ��(���PC �������� ���� ���̵� 000000 ���� 0000���� ����)
 *
 */
public class Ex2_ä��_Test {

	public static void main(String[] args) {
		SHA256Salt sha256 = new SHA256Salt();
		int nonce = 0;
		while (true) {
			if (sha256.getChangeHash(nonce + "").substring(0, 4).equals("0000")) { // ���� ���̵� ����
				System.out.println("ä�� ���� : " + nonce);
				System.out.println("�ؽ� �� : " + sha256.getChangeHash(nonce + ""));
				break;
			}
			nonce++;
		}
	}
}
