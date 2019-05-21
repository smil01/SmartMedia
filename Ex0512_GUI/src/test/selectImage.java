package test;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;

public class selectImage {

	public static BufferedImage main(String[] args) {
		byte[] arr = null;
		BufferedImage bufferedImage = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

			String insertSql = "select * from TEST_IMG where id = 3";
			PreparedStatement psmt = conn.prepareStatement(insertSql);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				int a = rs.getInt(1);
				arr = rs.getBytes(2);

				bufferedImage = byteArrayConvertToImageFile(arr);
			}

			psmt.close();

			// 연결해제
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resize(bufferedImage, 80, 80);
	}

	public static BufferedImage byteArrayConvertToImageFile(byte[] imageByte) {
		ByteArrayInputStream inputStream = null;
		BufferedImage bufferedImage = null;
		try {
			inputStream = new ByteArrayInputStream(imageByte);
			bufferedImage = ImageIO.read(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bufferedImage;
	}
	
	public static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }
}
