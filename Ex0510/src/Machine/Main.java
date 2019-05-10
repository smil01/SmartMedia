package Machine;

public class Main {

	public static void main(String[] args) {
		Butter[] butters = new Butter[5];
		for (int i = 0; i < butters.length; i++) {
			butters[i] = new Butter();
		}

		Yado[] yados = new Yado[5];
		for (int i = 0; i < yados.length; i++) {
			yados[i] = new Yado();
		}

		Machine m1 = new Machine(butters);
		Monsta dol = m1.run();
		dol.pickMonsta();

		Machine m2 = new Machine(yados);
		Monsta dol2 = m2.run();
		dol2.pickMonsta();
	}

}
