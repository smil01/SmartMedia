package OOP;

public class CoinBank {
	private int money = 0;

	public void deposit(int inMoney) {
		this.money += inMoney;
	}

	public void withdraw(int outMoney) {
		if (outMoney <= this.money) {
			this.money -= outMoney;
		} else {
			System.out.println("����� �Ұ��� �մϴ�.");
		}
	}

	public int showMoney() {
		return this.money;
	}
}
