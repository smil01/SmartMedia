package SecurityUtil.Blockchain;

import SecurityUtil.SHA256.SHA256Salt;

/**
 * 
 * @author	: �����
 * @date	: 2019. 5. 9.
 * @time	: ���� 3:46:49
 * @content	: ���ü�� ���(�������ϰԴ� �ٸ����� ���ظ� �������� ���� ���ؼ� DTO�� ���� �����̶�� ��)
 * // ������ Ʈ�������� ���� fromId, toId, coin�� ����Ʈ ���·� �����ؾ����� ���� ���α׷��� �ϳ��� Ʈ�����ǿ� �ϳ��� �۾��� �Ұ��̿��� �����Ͽ���.
 */
public class Block {

	/**
	 * @param blockId ���° ������� (pk)
	 * @param previousBlockHash ���� ����� �ؽ���
	 * @param nonce �ؽ����� ���� �ؽ�����
	 * @param fromId ������ ������ ����� id
	 * @param toId ������ �޴� ����� id
	 * @param coin ����
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
				System.out.println(blockId + "�� ����� ä�� ����");
				break;
			}
			nonce++;
		}
	}

	public void getInformation() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("��� ��ȣ : " + getBlockId());
		System.out.println("���� �ؽ� �� : " + getPreviousBlockHash());
		System.out.println("ä�� ���� �� : " + getNonce());
		System.out.println("��� ������ : " + getFromId() + "--" + getCoin() + "-->" + getToId());
		System.out.println("��� �ؽ� : " + getBlockHash());
		System.out.println("---------------------------------------------------------------------------------------");
	}
}
