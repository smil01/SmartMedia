package SecurityUtil;

import SecurityUtil.SHA256.SHA256;
import SecurityUtil.SHA256.SHA256Salt;

/**
 * 
 * @author	: �����
 * @date	: 2019. 5. 9.
 * @time	: ���� 2:16:38
 * @content	: sha256 ��밡�̵�
 *
 */

public class Ex1_SHA256_Test {

	public static void main(String[] args) {
		SHA256 sha256 = new SHA256(); // �ұݰ� ���� SHA256 ���� ���
		System.out.println(sha256.getChangeHash("�����"));
		
		SHA256Salt sha257_SALT = new SHA256Salt(); // �ұݰ� �ִ� SHA256���
		System.out.println(sha257_SALT.getChangeHash("�����"));
	}

}
