
public class MemberVO {
	private String id;
	private String pw;
	private String date;

	public MemberVO(String id, String pw, String date) {
		this.id = id;
		this.pw = pw;
		this.date = date;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Id : " + id + "\nPw : " + pw + "\nDate : " + date;
	}

}
