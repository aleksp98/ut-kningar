package utokningar;

import java.util.ArrayList;

public class FruitStand {

	private String cityName;
	private int order;
	private ArrayList<FruitBasket> fruitBaskets = new ArrayList<>();


	public FruitStand(int order, String cityName, ArrayList<FruitBasket> fruits) {
		this.cityName = cityName;
		this.fruitBaskets = fruits;
		this.order = order;
	}	
	public String getCityName() {return cityName;}
	public int getOrder() {return order;}

	
	public boolean hasFruit(String fruitName) {
		
		if(fruitBaskets!=null) {
		
		for(FruitBasket i : fruitBaskets) {
			if(i.getFruitType().equals(fruitName))
				return true;
		}
		return false;	
	}
		return false;
	}

	public ArrayList<FruitBasket> getFruits(){return fruitBaskets;}
	
	public FruitBasket getFruit(String fruitType) {
	
		    for(FruitBasket i : fruitBaskets) {
		    	
		    	if(i.getFruitType().equals(fruitType))
		    		return i;
		    	
		    }
		
		return null;
		
		
	}
	
	
}
