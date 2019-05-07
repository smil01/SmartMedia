import java.util.ArrayList;

public class Phone {
	private ArrayList<PhoneVO> list = new ArrayList<PhoneVO>();

	public void insertList(PhoneVO vo) {
		list.add(vo);
	}

	public void deleteList(int index) {
		if (index < 0 || index > list.size() - 1) {
			System.out.println("없는 인덱스를 입력하셨습니다.");
		} else {
			System.out.println(list.get(index) + "에 정보를 삭제하였습니다.");
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
			System.out.println("존재하지 않는 이름입니다.");
		}
	}

	public void listAll() {
		if (list.size() == 0) {
			System.out.println("리스트에 값이 존재하지 않습니다.");
		} else {
			for (int index = 0; index < list.size(); index++) {
				System.out.println(index + 1 + ". " + list.get(index));
			}
		}

	}

	public void startPrint() {
		System.out.println("==========전화번호관리 프로그램==========");
	}

	public void menuPrint() {
		System.out.print("[1]추가 [2]삭제 [3]검색 [4]전체조회 [5]종료 >> ");
	}

	public void namePrint() {
		System.out.print("이름 >> ");
	}

	public void agePrint() {
		System.out.print("나이 >> ");
	}

	public void numPrint() {
		System.out.print("전화번호 >> ");
	}

	public void delPrint() {
		System.out.print("삭제할 번호 >> ");
	}

	public void searchPrint() {
		System.out.print("검색어를 입력하세요 >> ");
	}
	
	public void endPrint() {
		System.out.println("=========전화번호관리 프로그램 종료========");
	}
}
