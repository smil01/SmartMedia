package OOP;

public class Refrigerator {
	// 문 열고 닫고
	boolean door = false;
	// 온도 올리고 내리고
	int temperature = 0;

	public void doorOpen() {
		door = true;
	}

	public void doorClose() {
		door = false;
	}

	public String doorStatus() {
		if (door)
			return "문은 열려있습니다.";
		else
			return "문은 닫혀있습니다.";
	}

	public void temperatureUp() {
		++temperature;
	}

	public void temperatureDown() {
		--temperature;
	}

	public String temperatureStatus() {
		return "현재 온도는 "+ temperature + "도 입니다.";
	}
}
