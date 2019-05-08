package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex0507_review {

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
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			String sql = "insert into member values(?, ?, ?, ?)";

			pst = conn.prepareStatement(sql);
			pst.setString(1, "odd07");
			pst.setString(2, "6506");
			pst.setString(3, "오대길");
			pst.setString(4, "010-3938-7841");

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("작업 성공");
			} else {
				System.out.println("작업 실패");
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
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

}
