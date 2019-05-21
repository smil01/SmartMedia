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

			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 오라클 연결
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

			// 파일 정보
			File file = new File("C:\\Users\\pc-22\\Desktop\\수정이미지\\프로필.jpg");
			InputStream is = new FileInputStream(file);
			int fileSize = (int) file.length();

			// 입력쿼리 구성
			String insertSql = "INSERT INTO TEST_IMG VALUES( 3, ?)";
			PreparedStatement psmt = conn.prepareStatement(insertSql);

			// [스트림을 이용하는 방법]
			psmt.setBinaryStream(1, is, fileSize);

			// [byte배열을 이용하는 방법]
			byte[] buffer = new byte[fileSize];
			is.read(buffer);
			psmt.setBytes(1, buffer);

			// 입력
			int insertCount = psmt.executeUpdate();
			
			System.out.println(insertCount);
			
			psmt.close();

			// 연결해제
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
