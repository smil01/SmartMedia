
public class PhoneVO {
	private String name;
	private int age;
	private String num;

	public PhoneVO(String name, int age, String num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNum() {
		return num;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")¼¼ : " + num;
	}

}
