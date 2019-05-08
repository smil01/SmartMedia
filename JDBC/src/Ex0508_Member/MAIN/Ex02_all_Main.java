package Ex0508_Member.MAIN;

import java.util.ArrayList;
import java.util.Scanner;

import Ex0508_Member.DAO.MemberDAO;
import Ex0508_Member.DTO.MemberDTO;

public class Ex02_all_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();

		System.out.println("========== ȸ������ ���α׷� ===========");
		int select = 0;
		do {
			System.out.println("[1]ȸ������ [2]ȸ���������� [3]ȸ������ [4]ȸ���������� [5]����");
			select = sc.nextInt();

			switch (select) {
			case 1:
				MemberDTO dto = new MemberDTO();

				System.out.print("ID �Է� >>");
				dto.setId(sc.next());
				System.out.print("PW �Է� >>");
				dto.setPw(sc.next());
				System.out.print("�̸� �Է� >>");
				dto.setName(sc.next());
				System.out.print("TEL �Է� >>");
				dto.setTel(sc.next());

				if (dao.insert(dto)) {
					System.out.println("���Կ� �����Ͽ����ϴ�.");
				} else {
					System.out.println("���Կ� �����Ͽ����ϴ�.");
				}
				break;
			case 2:
				System.out.println("[1]PW [2]NAME [3]TEL");
				select = sc.nextInt();

				System.out.print("ID �Է� >>");
				String id = sc.next();
				System.out.print("���� �� �Է� >>");
				String val = sc.next();
				String sql = "";

				switch (select) {
				case 1:
					sql = "pw";
					break;
				case 2:
					sql = "name";
					break;
				case 3:
					sql = "tel";
					break;
				}
				if (dao.update(id, val, sql)) {
					System.out.println("���濡 �����Ͽ����ϴ�.");
				} else {
					System.out.println("���濡 �����Ͽ����ϴ�.");
				}
				break;
			case 3:
				System.out.print("ID �Է� >>");
				String id2 = sc.next();
				System.out.print("PW �Է� >>");
				String pw2 = sc.next();

				if (dao.delete(id2, pw2)) {
					System.out.println("������ �����Ͽ����ϴ�.");
				} else {
					System.out.println("������ �����Ͽ����ϴ�.");
				}
				break;
			case 4:
				ArrayList<MemberDTO> list = dao.selectAll();
				if (list != null) {
					for (int i = 0; i < list.size(); i++) {
						System.out.println(i + 1 + ". " + list.get(i));
					}
				}
				break;
			}
		} while (select != 5);

		dao.close();
		sc.close();
	}

}
