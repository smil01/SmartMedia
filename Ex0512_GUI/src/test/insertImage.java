package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertImage {
	public static void main(String[] args) {
		try {

			// ����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ����Ŭ ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

			// ���� ����
			File file = new File("C:\\Users\\pc-22\\Desktop\\�����̹���\\������.jpg");
			InputStream is = new FileInputStream(file);
			int fileSize = (int) file.length();

			// �Է����� ����
			String insertSql = "INSERT INTO TEST_IMG VALUES( 3, ?)";
			PreparedStatement psmt = conn.prepareStatement(insertSql);

			// [��Ʈ���� �̿��ϴ� ���]
			psmt.setBinaryStream(1, is, fileSize);

			// [byte�迭�� �̿��ϴ� ���]
			byte[] buffer = new byte[fileSize];
			is.read(buffer);
			psmt.setBytes(1, buffer);

			// �Է�
			int insertCount = psmt.executeUpdate();
			
			System.out.println(insertCount);
			
			psmt.close();

			// ��������
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
