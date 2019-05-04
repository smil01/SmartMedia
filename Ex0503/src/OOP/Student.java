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
		System.out.println(name + "님 안녕하세요.");
		System.out.println("학번 : " + number + ", 나이 : " + age);
		System.out.println("자바 점수 : " + scoreJava);
		System.out.println("웹 점수 : " + scoreWeb);
		System.out.println("안드로이드 점수 : " + scoreAndroid);
	}
}
