package SecurityUtil;

import SecurityUtil.SHA256.SHA256Salt;
/**
 * 
 * @author	: 오대근
 * @date	: 2019. 5. 9.
 * @time	: 오후 2:16:57
 * @content	: 채굴 기본 모델(사용PC 성능으로 인한 난이도 000000 에서 0000으로 수정)
 *
 */
public class Ex2_채굴_Test {

	public static void main(String[] args) {
		SHA256Salt sha256 = new SHA256Salt();
		int nonce = 0;
		while (true) {
			if (sha256.getChangeHash(nonce + "").substring(0, 4).equals("0000")) { // 보안 난이도 설정
				System.out.println("채굴 성공 : " + nonce);
				System.out.println("해쉬 값 : " + sha256.getChangeHash(nonce + ""));
				break;
			}
			nonce++;
		}
	}
}
