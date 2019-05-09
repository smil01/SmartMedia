package Ex0509_Phone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PhoneDAO {
	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private String sql = null;

	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			final String user = "hr";
			final String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println(">> DBÁ¢¼Ó ¼º°ø <<");
			} else {
				System.out.println(">> DBÁ¢¼Ó ½ÇÆÐ <<");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
				System.out.println(">> ResultSet ´Ý±â <<");
			}
			if (pst != null) {
				pst.close();
				System.out.println(">> PreparedStatement ´Ý±â <<");
			}
			if (conn != null) {
				conn.close();
				System.out.println(">> Connection ´Ý±â <<");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insert(PhoneDTO dto) {
		getCon();

		sql = "insert into PHONE values (?, ?, ?)";
		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, dto.getName());
			pst.setInt(2, dto.getAge());
			pst.setString(3, dto.getTel());

			int cnt = pst.executeUpdate();

			return cnt;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close();

		return 0;
	}

	public int delete(String name) {
		getCon();

		String sql = "delete from PHONE where name = ?";

		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, name);

			int cnt = pst.executeUpdate();

			return cnt;
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return 0;
	}

	public ArrayList<PhoneDTO> selectAll() {
		getCon();

		String sql = "select * from PHONE";

		ArrayList<PhoneDTO> list = new ArrayList<PhoneDTO>();

		try {
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(new PhoneDTO(rs.getString(1), rs.getInt(2), rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return list;
	}

	public ArrayList<PhoneDTO> select(String name) {
		getCon();

		String sql = "select * from PHONE where name = ?";
		ArrayList<PhoneDTO> list = new ArrayList<PhoneDTO>();
		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, name);

			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(new PhoneDTO(rs.getString(1), rs.getInt(2), rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();

		return list;
	}

}
