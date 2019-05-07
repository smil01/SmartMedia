package Ex0507;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 
 * @author	: �����
 * @date	: 2019. 5. 7.
 * @time	: ���� 2:44:49
 * @content	: jdbc to oracle �⺻ ����
 *
 */
public class Ex01_std {

	public static void main(String[] args) {
		try {
			// DB ���� �ε� --> JDBC ����̹� ��� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ����
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
