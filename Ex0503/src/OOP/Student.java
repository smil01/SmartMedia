package OOP;

public class Student {
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public Student() {

	}

	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("�й� : " + number + ", ���� : " + age);
		System.out.println("�ڹ� ���� : " + scoreJava);
		System.out.println("�� ���� : " + scoreWeb);
		System.out.println("�ȵ���̵� ���� : " + scoreAndroid);
	}
}
