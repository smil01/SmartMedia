package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex02_insert2_변수 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("==========회원가입 프로그램==========");

		System.out.print("아이디 >> ");
		String id = scanner.next();
		System.out.print("패스워드 >> ");
		String pw = scanner.next();
		System.out.print("이름 >> ");
		String name = scanner.next();
		System.out.print("전화번호 >> ");
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
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			String sql = "insert into member values(?, ?, ?, ?)";

			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, name);
			pst.setString(4, tel);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("가입 성공");
			} else {
				System.out.println("가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
