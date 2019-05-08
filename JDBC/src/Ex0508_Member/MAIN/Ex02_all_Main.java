package Ex0508_Member.MAIN;

import java.util.ArrayList;
import java.util.Scanner;

import Ex0508_Member.DAO.MemberDAO;
import Ex0508_Member.DTO.MemberDTO;

public class Ex02_all_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();

		System.out.println("========== 회원과리 프로그램 ===========");
		int select = 0;
		do {
			System.out.println("[1]회원가입 [2]회원정보수정 [3]회원삭제 [4]회원정보보기 [5]종료");
			select = sc.nextInt();

			switch (select) {
			case 1:
				MemberDTO dto = new MemberDTO();

				System.out.print("ID 입력 >>");
				dto.setId(sc.next());
				System.out.print("PW 입력 >>");
				dto.setPw(sc.next());
				System.out.print("이름 입력 >>");
				dto.setName(sc.next());
				System.out.print("TEL 입력 >>");
				dto.setTel(sc.next());

				if (dao.insert(dto)) {
					System.out.println("가입에 성공하였습니다.");
				} else {
					System.out.println("가입에 실패하였습니다.");
				}
				break;
			case 2:
				System.out.println("[1]PW [2]NAME [3]TEL");
				select = sc.nextInt();

				System.out.print("ID 입력 >>");
				String id = sc.next();
				System.out.print("변경 값 입력 >>");
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
					System.out.println("변경에 성공하였습니다.");
				} else {
					System.out.println("변경에 실패하였습니다.");
				}
				break;
			case 3:
				System.out.print("ID 입력 >>");
				String id2 = sc.next();
				System.out.print("PW 입력 >>");
				String pw2 = sc.next();

				if (dao.delete(id2, pw2)) {
					System.out.println("삭제에 성공하였습니다.");
				} else {
					System.out.println("삭제에 실패하였습니다.");
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
