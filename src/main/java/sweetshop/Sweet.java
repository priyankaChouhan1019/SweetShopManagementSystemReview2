package sweetshop;

public class Sweet {
	enum Color {
		RED, GREEN, WHITE, GREEN_WHITE;
	}
	
	enum Category {
		MILK, SUGARLESS, GHEE, BENGALISWEET;
	}
	
	Color color;
	Category category;
	String id, name;
	int price;
	
	@Override
	public String toString() {
		return "Sweet [color=" + color + ", category=" + category + ", id=" + id + ", name=" + name + ", price=" + price
				+ "]";
	}
	
	
}
