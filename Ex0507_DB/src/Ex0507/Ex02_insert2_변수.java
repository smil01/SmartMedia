package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex02_insert2_���� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("==========ȸ������ ���α׷�==========");

		System.out.print("���̵� >> ");
		String id = scanner.next();
		System.out.print("�н����� >> ");
		String pw = scanner.next();
		System.out.print("�̸� >> ");
		String name = scanner.next();
		System.out.print("��ȭ��ȣ >> ");
		String tel = scanner.next();

		Connection conn = null;
		PreparedStatement pst = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

			String sql = "insert into member values(?, ?, ?, ?)";

			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, name);
			pst.setString(4, tel);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
