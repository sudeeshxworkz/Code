class FoodPandaRunner{
	
	public static void main(String[] appl){ 
	    String foodName="Pasta";
		int quantity=2;
		double Price = search(foodName,quantity);
		System.out.println(foodName+" price is:"+Price);
	}
	public static double search(String foodName, int quantity){
		if(foodName == "Pasta"){
			
			return 56.00*quantity;
		}
		
		return 0.0;
	}
}