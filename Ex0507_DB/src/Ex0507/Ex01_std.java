package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 
 * @author	: 오대근
 * @date	: 2019. 5. 7.
 * @time	: 오후 2:44:49
 * @content	: jdbc to oracle 기본 포멧
 *
 */
public class Ex01_std {

	public static void main(String[] args) {
		try {
			// DB 동적 로딩 --> JDBC 드라이버 경로 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
