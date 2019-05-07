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
			// ���̺귯�� �����ε�(���)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ���ῡ �ʿ��� ������ �غ�
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			// �ʿ䵥���͸� �����ϰ� Ŀ�ؼ���
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}

			String sql = "INSERT INTO member VALUES('odd02','6506', 'DaegeunOh','010-7552-0440')";

			// sql ���� �����Ͽ� db�� ȣ���� �� �ִ� ���·� ��ȯ
			pst = conn.prepareStatement(sql);

			// sql�� ����
			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println("���Լ���");
			} else {
				System.out.println("���Խ���");
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
