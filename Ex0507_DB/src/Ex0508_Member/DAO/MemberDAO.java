package Ex0508_Member.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Ex0508_Member.DTO.MemberDTO;

public class MemberDAO {
	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private String sql = null;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";

			this.conn = DriverManager.getConnection(url, user, password);

			if (this.conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
				System.out.println("rs해제");
			}
			if (pst != null) {
				pst.close();
				System.out.println("pst해제");
			}
			if (conn != null) {
				conn.close();
				System.out.println("conn해제;");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean insert(MemberDTO dto) {
		try {
			sql = "insert into member values(?, ?, ?, ?)";

			pst = conn.prepareStatement(sql);
			pst.setString(1, dto.getId());
			pst.setString(2, dto.getPw());
			pst.setString(3, dto.getName());
			pst.setString(4, dto.getTel());

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(String id, String val, String sql) {
		try {
			this.sql = "update member set " + sql + " = ? where id = ?";

			pst = conn.prepareStatement(this.sql);
			pst.setString(1, val);
			pst.setString(2, id);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean delete(String id, String pw) {
		try {
			sql = "delete from member where id = ? and pw = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public ArrayList<MemberDTO> selectAll() {
		try {
			ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

			sql = "select * from member";

			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

			if (rs != null) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
