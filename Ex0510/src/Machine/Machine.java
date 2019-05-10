package Machine;

import java.util.Random;

public class Machine {

	private Monsta[] doll;

	public Machine(Monsta[] doll) {
		this.doll = doll;
	}

	public Monsta run() {
		Random random = new Random();

		return doll[random.nextInt(doll.length)];
	}

}
