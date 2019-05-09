package SecurityUtil;

import SecurityUtil.SHA256.SHA256;
import SecurityUtil.SHA256.SHA256Salt;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 5. 9.
 * @time	: 오후 2:16:38
 * @content	: sha256 사용가이드
 *
 */

public class Ex1_SHA256_Test {

	public static void main(String[] args) {
		SHA256 sha256 = new SHA256(); // 소금값 없는 SHA256 변조 모듈
		System.out.println(sha256.getChangeHash("오대근"));
		
		SHA256Salt sha257_SALT = new SHA256Salt(); // 소금값 있는 SHA256모듈
		System.out.println(sha257_SALT.getChangeHash("오대근"));
	}

}
