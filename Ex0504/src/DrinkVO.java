
public class DrinkVO {
	private int price;
	private String title;
	private int stock;

	public DrinkVO(int price, String title, int stock) {
		this.price = price;
		this.title = title;
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String toString() {
		return this.title + "(" + this.price + "¿ø, " + this.stock + "°³)";
	}
}
