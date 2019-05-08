package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04_update2_���� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===========ȸ������ ���α׷�============");
		System.out.print("������ id�� �Է� �ϼ��� >>");
		String updateId = scanner.next();
		System.out.println("������ �÷��� �����ϼ���.");
		System.out.print("[1]pw [2]name [3]tel >> ");
		int updateCol = scanner.nextInt();

		String updateColume = null;
		switch (updateCol) {
		case 1:
			updateColume = "pw";
			break;
		case 2:
			updateColume = "name";
			break;
		case 3:
			updateColume = "tel";
			break;
		}

		System.out.print("������ " + updateColume + "�� �Է��Ͻÿ� >> ");
		String val = scanner.next();

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("���ῡ �����Ͽ����ϴ�.");
			} else {
				System.out.println("���ῡ ���� �Ͽ����ϴ�.");
			}

			String sql = "update member set " + updateColume + " = ? where id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, val);
			pst.setString(2, updateId);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("������Ʈ�� ���� �Ͽ����ϴ�.");
			} else {
				System.out.println("������Ʈ�� ���� �Ͽ����ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pst != null)
					pst.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

}
