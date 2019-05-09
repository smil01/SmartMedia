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

		System.out.println("=========== ��ȭ��ȣ�� ==========");

		while (true) {
			System.out.println("[1]��ȭ��ȣ�߰� [2]��ȭ��ȣ���� [3]��ü�˻� [4]���ð˻� [5]����");
			int select = scanner.nextInt();

			if (select == 1) {
				String sql = "insert into PHONE values (?, ?, ?)";
				PhoneDTO dto = new PhoneDTO();

				System.out.print("�̸� �Է� >> ");
				dto.setName(scanner.next());

				System.out.print("���� �Է� >> ");
				dto.setAge(scanner.nextInt());

				System.out.print("��ȣ �Է� >> ");
				dto.setTel(scanner.next());

				int cnt = dao.insert(dto);

				if (cnt > 0) {
					System.out.println("�߰� ����");
				} else {
					System.out.println("�߰� ����");
				}
			} else if (select == 2) {
				System.out.print("���� �� �̸� �Է� >> ");
				String name = scanner.next();

				int cnt = dao.delete(name);

				if (cnt > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
			} else if (select == 3) {
				ArrayList<PhoneDTO> list = dao.selectAll();

				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + ". " + list.get(i));
				}
			} else if (select == 4) {
				System.out.print("�˻� �̸� �Է� >> ");
				String name = scanner.next();

				ArrayList<PhoneDTO> list = dao.select(name);

				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + ". " + list.get(i));
				}
			} else if (select == 5) {
				System.out.println("=========== �ý������� ==========");
				break;
			} else {
				System.out.println("�ٽ� �Է� �� �ּ���.");
			}
		}

		scanner.close();
	}
}
