package SecurityUtil;

import SecurityUtil.Blockchain.Block;

public class Ex4_Transactions_Test {

	public static void main(String[] args) {
		Block block = new Block(1, null, 0, "�����", "������", 2000);
		block.mine();
		block.getInformation();

		Block block2 = new Block(2, block.getBlockHash(), 0, "������", "��ġ��", 2000);
		block2.mine();
		block2.getInformation();

		Block block3 = new Block(3, block2.getBlockHash(), 0, "��ġ��", "����", 2000);
		block3.mine();
		block3.getInformation();

		Block block4 = new Block(4, block3.getBlockHash(), 0, "����", "�Ǽֺ�", 2000);
		block4.mine();
		block4.getInformation();
	}

}
