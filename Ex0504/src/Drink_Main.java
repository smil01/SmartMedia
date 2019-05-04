
public class Drink_Main {

	public static void main(String[] args) {
		// 콜라 1200 4개
		// 생수 500 1개
		// 커피 5500 3개

		DrinkVO cocaCola = new DrinkVO(1200, "콜라", 4);
		DrinkVO mineralWater = new DrinkVO(500, "생수", 1);
		DrinkVO starbucksCoffee = new DrinkVO(5500, "스벅커피", 3);
		
		
		System.out.println(cocaCola);
		System.out.println(mineralWater);
		System.out.println(starbucksCoffee);
	}
}
