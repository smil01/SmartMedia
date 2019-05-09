package Ex0509_Phone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneDAO dao = new PhoneDAO();

		System.out.println("=========== 전화번호부 ==========");

		while (true) {
			System.out.println("[1]전화번호추가 [2]전화번호삭제 [3]전체검색 [4]선택검색 [5]종료");
			int select = scanner.nextInt();

			if (select == 1) {
				String sql = "insert into PHONE values (?, ?, ?)";
				PhoneDTO dto = new PhoneDTO();

				System.out.print("이름 입력 >> ");
				dto.setName(scanner.next());

				System.out.print("나이 입력 >> ");
				dto.setAge(scanner.nextInt());

				System.out.print("번호 입력 >> ");
				dto.setTel(scanner.next());

				int cnt = dao.insert(dto);

				if (cnt > 0) {
					System.out.println("추가 성공");
				} else {
					System.out.println("추가 실패");
				}
			} else if (select == 2) {
				System.out.print("삭제 할 이름 입력 >> ");
				String name = scanner.next();

				int cnt = dao.delete(name);

				if (cnt > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
			} else if (select == 3) {
				ArrayList<PhoneDTO> list = dao.selectAll();

				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + ". " + list.get(i));
				}
			} else if (select == 4) {
				System.out.print("검색 이름 입력 >> ");
				String name = scanner.next();

				ArrayList<PhoneDTO> list = dao.select(name);

				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + ". " + list.get(i));
				}
			} else if (select == 5) {
				System.out.println("=========== 시스템종료 ==========");
				break;
			} else {
				System.out.println("다시 입력 해 주세요.");
			}
		}

		scanner.close();
	}
}
