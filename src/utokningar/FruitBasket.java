package utokningar;

public class FruitBasket {

	private String fruitType;
	private double price;
	
	public FruitBasket(String fruitType, double price) {
		this.fruitType = fruitType;
		this.price = price;
	}
	
	public String getFruitType() {return fruitType;}
	
	public double getPrice() {return price;}
	
}
