package SecurityUtil.Blockchain;

import SecurityUtil.SHA256.SHA256Salt;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 5. 9.
 * @time	: 오후 3:46:49
 * @content	: 블록체인 블록(디테일하게는 다르지만 이해를 돕기위해 쉽게 말해서 DTO와 같은 역할이라고 봄)
 * // 원래는 트렌젝션을 만들어서 fromId, toId, coin을 리스트 형태로 관리해야지만 현재 프로그램은 하나에 트렌젝션에 하나의 작업만 할것이여서 통합하였다.
 */
public class Block {

	/**
	 * @param blockId 몇번째 블록인지 (pk)
	 * @param previousBlockHash 이전 블록의 해쉬값
	 * @param nonce 해쉬값을 만들 해쉬변수
	 * @param fromId 코인을 보내는 사람의 id
	 * @param toId 코인을 받는 사람의 id
	 * @param coin 코인
	 */

	private int blockId;
	private String previousBlockHash;
	private int nonce;
	private String fromId;
	private String toId;
	private int coin;

	public Block(int blockId, String previousBlockHash, int nonce, String fromId, String toId, int coin) {
		super();
		this.blockId = blockId;
		this.previousBlockHash = previousBlockHash;
		this.nonce = nonce;
		this.fromId = fromId;
		this.toId = toId;
		this.coin = coin;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}

	public String getPreviousBlockHash() {
		return previousBlockHash;
	}

	public void setPreviousBlockHash(String previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}

	public int getNonce() {
		return nonce;
	}

	public void setNonce(int nonce) {
		this.nonce = nonce;
	}

	public String getFromId() {
		return fromId;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}

	public String getToId() {
		return toId;
	}

	public void setToId(String toId) {
		this.toId = toId;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public String getBlockHash() {
		SHA256Salt sha256 = new SHA256Salt();

		return sha256.getChangeHash(nonce + previousBlockHash + fromId + toId + coin);
	}

	public void mine() {
		while (true) {
			if (getBlockHash().substring(0, 4).equals("0000")) {
				System.out.println(blockId + "번 블록의 채굴 성공");
				break;
			}
			nonce++;
		}
	}

	public void getInformation() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("블록 번호 : " + getBlockId());
		System.out.println("이전 해쉬 값 : " + getPreviousBlockHash());
		System.out.println("채굴 변수 값 : " + getNonce());
		System.out.println("블록 데이터 : " + getFromId() + "--" + getCoin() + "-->" + getToId());
		System.out.println("블록 해시 : " + getBlockHash());
		System.out.println("---------------------------------------------------------------------------------------");
	}
}
