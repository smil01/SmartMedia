package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex04_update {

	public static void main(String[] args) {
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

			String sql = "update member set pw = '12345' where id = 'odd02'";

			pst = conn.prepareStatement(sql);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("������Ʈ ����");
			} else {
				System.out.println("������Ʈ ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pst != null)
					pst.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

}
