package OOP;

public class Refrigerator {
	// �� ���� �ݰ�
	boolean door = false;
	// �µ� �ø��� ������
	int temperature = 0;

	public void doorOpen() {
		door = true;
	}

	public void doorClose() {
		door = false;
	}

	public String doorStatus() {
		if (door)
			return "���� �����ֽ��ϴ�.";
		else
			return "���� �����ֽ��ϴ�.";
	}

	public void temperatureUp() {
		++temperature;
	}

	public void temperatureDown() {
		--temperature;
	}

	public String temperatureStatus() {
		return "���� �µ��� "+ temperature + "�� �Դϴ�.";
	}
}
