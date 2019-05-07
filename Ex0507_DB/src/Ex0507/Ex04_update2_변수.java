package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04_update2_변수 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===========회원수정 프로그램============");
		System.out.print("수정할 id를 입력 하세요 >>");
		String updateId = scanner.next();
		System.out.println("수정할 컬럼을 선택하세요.");
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

		System.out.print("수정할 " + updateColume + "를 입력하시오 >> ");
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
				System.out.println("연결에 성공하였습니다.");
			} else {
				System.out.println("연결에 실패 하였습니다.");
			}

			String sql = "update member set " + updateColume + " = ? where id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, val);
			pst.setString(2, updateId);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("업데이트에 성공 하였습니다.");
			} else {
				System.out.println("업데이트에 실패 하였습니다.");
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
