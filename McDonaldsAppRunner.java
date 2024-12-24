class McDonaldsAppRunner{
	public static void main(String donalds[]){
		String foodName="Egg McMuffin";
		double price=McDonaldsApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Big Breakfast";
		price=McDonaldsApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Hotcakes";
		price=McDonaldsApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Sausage McMuffin";
		price=McDonaldsApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Hash Browns";
		price=McDonaldsApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Big Mac";
		price=McDonaldsApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		System.out.println();
		
		foodName="Egg McMuffin";
		price=McDonaldsApp.search(foodName,4);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Big Breakfast";
		price=McDonaldsApp.search(foodName,4);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Hotcakes";
		price=McDonaldsApp.search(foodName,3);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Sausage McMuffin";
		price=McDonaldsApp.search(foodName,2);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Hash Browns";
		price=McDonaldsApp.search(foodName,10);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Big Mac";
		price=McDonaldsApp.search(foodName,7);
		System.out.println("The price of "+foodName+" is Rs."+price);
	}
}