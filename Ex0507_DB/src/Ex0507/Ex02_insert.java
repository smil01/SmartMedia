package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex02_insert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			// 라이브러리 동적로딩(경로)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 연결에 필요한 데이터 준비
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			// 필요데이터를 셋팅하고 커넥션함
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			String sql = "INSERT INTO member VALUES('odd02','6506', 'DaegeunOh','010-7552-0440')";

			// sql 문을 셋팅하여 db를 호출할 수 있는 형태로 변환
			pst = conn.prepareStatement(sql);

			// sql문 실행
			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("삽입성공");
			} else {
				System.out.println("삽입실패");
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(conn!=null) conn.close();
					if(pst!=null) pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}			
		}

	}

}
