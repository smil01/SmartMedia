package OOP;

public class Refrigerator_main {

	public static void main(String[] args) {
		Refrigerator lgRefrigerator = new Refrigerator();
		
		lgRefrigerator.doorOpen();
		lgRefrigerator.temperatureUp();
		lgRefrigerator.temperatureUp();
		lgRefrigerator.temperatureDown();
		lgRefrigerator.temperatureDown();
		lgRefrigerator.temperatureDown();
		lgRefrigerator.temperatureDown();
		
		System.out.println(lgRefrigerator.doorStatus());
		System.out.println(lgRefrigerator.temperatureStatus());
		
		
		
		lgRefrigerator.temperatureUp();
		lgRefrigerator.temperatureUp();
		lgRefrigerator.doorClose();
		
		System.out.println(lgRefrigerator.doorStatus());
		System.out.println(lgRefrigerator.temperatureStatus());
	}

}
