package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex0507_ex {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		Scanner scanner = new Scanner(System.in);

		System.out.println("==========ȸ������ ���α׷�==========");
		System.out.print("������ ���̵� �Է� >>");
		String id = scanner.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}
			
			String sql = "delete from member where id = ?";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			
			int cnt = pst.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("��������");
			} else {
				System.out.println("��������");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null) {
					pst.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		scanner.close();
	}

}
