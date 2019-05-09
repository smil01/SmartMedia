package Ex0509_Phone;

public class PhoneDTO {
	private String name;
	private int age;
	private String tel;

	public PhoneDTO() {

	}

	public PhoneDTO(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 전화번호 : " + tel;
	}

}
