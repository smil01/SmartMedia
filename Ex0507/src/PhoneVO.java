
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

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")�� : " + num;
	}
	
	
}
