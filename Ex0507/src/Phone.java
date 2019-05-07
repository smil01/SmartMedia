import java.util.ArrayList;

public class Phone {
	private ArrayList<PhoneVO> list = new ArrayList<PhoneVO>();

	public void insertList(PhoneVO vo) {
		list.add(vo);
	}

	public void deleteList(int index) {
		if (index < 0 || index > list.size() - 1) {
			System.out.println("���� �ε����� �Է��ϼ̽��ϴ�.");
		} else {
			System.out.println(list.get(index) + "�� ������ �����Ͽ����ϴ�.");
			list.remove(index);
		}
	}

	public void search(String name) {
		boolean result = true;

		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getName().equals(name)) {
				System.out.println(list.get(index));
				result = false;
			}
		}

		if (result) {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
	}

	public void listAll() {
		if (list.size() == 0) {
			System.out.println("����Ʈ�� ���� �������� �ʽ��ϴ�.");
		} else {
			for (int index = 0; index < list.size(); index++) {
				System.out.println(index + 1 + ". " + list.get(index));
			}
		}

	}

	public void startPrint() {
		System.out.println("==========��ȭ��ȣ���� ���α׷�==========");
	}

	public void menuPrint() {
		System.out.print("[1]�߰� [2]���� [3]�˻� [4]��ü��ȸ [5]���� >> ");
	}

	public void namePrint() {
		System.out.print("�̸� >> ");
	}

	public void agePrint() {
		System.out.print("���� >> ");
	}

	public void numPrint() {
		System.out.print("��ȭ��ȣ >> ");
	}

	public void delPrint() {
		System.out.print("������ ��ȣ >> ");
	}

	public void searchPrint() {
		System.out.print("�˻�� �Է��ϼ��� >> ");
	}
	
	public void endPrint() {
		System.out.println("=========��ȭ��ȣ���� ���α׷� ����========");
	}
}
