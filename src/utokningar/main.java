package utokningar;

import java.util.ArrayList;
import java.util.Arrays;



public class main {

	public static void main(String[] args) {


		ArrayList<FruitBasket> arr1 = new ArrayList<>(Arrays.asList(new FruitBasket("pear",67.8)));

		ArrayList<FruitBasket> arr2 = new ArrayList<>(Arrays.asList(new FruitBasket("cherry",10.9),new FruitBasket("peach",12.9)));

		ArrayList<FruitBasket> arr3 = new ArrayList<>(Arrays.asList(new FruitBasket("cherry",10.9),new FruitBasket("pear",55.9)));

		ArrayList<FruitBasket> arr4 = new ArrayList<>(Arrays.asList(new FruitBasket("cherry",10.9),new FruitBasket("cherry",10.9),new FruitBasket("pear",67.8)));

		FruitStand [] stands= new FruitStand [] {
				new FruitStand(1,"Gothenburg",arr1 ), 
				new FruitStand(2,"Kungsbacka", arr2),
				new FruitStand(3, "Varberg", arr3),
				new FruitStand(4, "Falkenberg", arr2),
				new FruitStand(5, "Halmstad", null),
				new FruitStand(6, "Helsingborg", arr4)
		};

		System.out.println("Utökning 1 " );
		FruitStand pear = hasPear(stands);
		System.out.println("Stad: "+ pear.getCityName());
		double cost = pear.getFruit("pear").getPrice() + cherryOrPeach(pear).getPrice() ;
		System.out.println("Total Price: "+ cost + " kr");
		System.out.println(" ------------------ \n Utökning 2 " );
		System.out.println("Stad: "+ pear.getCityName());
		System.out.println("Price pear : "+ pear.getFruit("pear").getPrice() + " kr");
		System.out.println("Price for "+ cherryOrPeach(pear).getFruitType() + ": "+ pear.getFruit(cherryOrPeach(pear).getFruitType()).getPrice() + " kr");
		System.out.println(" ------------------ \n Utökning 3 " );
		System.out.println("This stand was in order: "+  pear.getOrder() );

		System.out.println(" ------------------ \n Utökning 4 " );

		FruitStand friend = friend(stands,pear);
		System.out.println("Stad: "+ friend.getCityName());
		double cost1 = friend.getFruit("pear").getPrice() + cherryOrPeach(friend).getPrice() ;
		System.out.println("Total Price: "+ cost1 + " kr");
		System.out.println("Stad: "+ friend.getCityName());
		System.out.println("Price pear : "+ friend.getFruit("pear").getPrice() + " kr");
		System.out.println("Price for "+ cherryOrPeach(friend).getFruitType() + ": "+ friend.getFruit(cherryOrPeach(friend).getFruitType()).getPrice() + " kr");
		System.out.println("This stand was in order: "+  friend.getOrder() );
		
	}


	public static FruitStand hasPear(FruitStand[] stands) {

		for(FruitStand i : stands) {

			if(i.hasFruit("pear") && (i.hasFruit("peach")|| i.hasFruit("cherry")))
			{
				return i;  
			}
		}

		//if no one found return dummy variable
		return new FruitStand(-1," ",null);
	}

	public static FruitBasket cherryOrPeach(FruitStand stand) {

		//if both choose peach by default
		if(stand.hasFruit("peach") && stand.hasFruit("cherry")) {

			return stand.getFruit("peach");

		} else if(stand.hasFruit("peach")) {

			return stand.getFruit("peach");
		}

		else {
			return stand.getFruit("cherry");
		}
	}

	public static FruitStand friend(FruitStand[] stands, FruitStand used) {
		for(FruitStand i : stands) {

			if(i.hasFruit("pear") && (i.hasFruit("peach")|| i.hasFruit("cherry")) && !i.equals(used))
			{	
				return i;  	
			}
		}
		//if no one found return dummy variable
		return new FruitStand(-1," ",null);
	}
}
