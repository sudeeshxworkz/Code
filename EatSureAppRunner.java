class EatSureAppRunner{
	public static void main(String eat[]){
		String foodName="Chicken Biryani";
		double price=EatSureApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Veg Biryani";
		price=EatSureApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Chicken Tikka Masala";
		price=EatSureApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Chicken Tandoori";
		price=EatSureApp.search(foodName);
		System.out.println("The price of "+foodName+ "is Rs."+price);
		foodName="Naan Bread";
		price=EatSureApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Butter Chicken";
		price=EatSureApp.search(foodName);
		System.out.println("The price of "+foodName+" is Rs."+price);
		System.out.println();
		
		foodName="Chicken Biryani";
		price=EatSureApp.search(foodName,3);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Veg Biryani";
		price=EatSureApp.search(foodName,4);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Chicken Tikka Masala";
		price=EatSureApp.search(foodName,5);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Chicken Tandoori";
		price=EatSureApp.search(foodName,3);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Naan Bread";
		price=EatSureApp.search(foodName,7);
		System.out.println("The price of "+foodName+" is Rs."+price);
		foodName="Butter Chicken";
		price=EatSureApp.search(foodName,9);
		System.out.println("The price of "+foodName+" is Rs."+price);
		}
}