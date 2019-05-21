package 시험;

public class Qusetion3 {
	// TODO : 클새스명을 어떻게 해야할지 모르겠어서, Qusetion3에 MemberVO클래스를 만들었습니다.
	public class MemberVO {
		private String name;
		private int age;
		private String id;
		private String pw;

		public MemberVO(String name, int age, String id, String pw) {
			super();
			this.name = name;
			this.age = age;
			this.id = id;
			this.pw = pw;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		@Override
		public String toString() {
			return "MemberVO [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
		}

	}
}
