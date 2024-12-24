class Hotel{
	public static double search(String foodName){
		if(foodName == "Cake"){
			System.out.println(foodName);
			return 50.00;
		}
		if(foodName == "Dessert"){
			System.out.println(foodName);
			return 100.50;
		}
		else{
			System.out.println("NOT FOUND");
		}
		return 0.0;	
	}
	public static double search(String foodName,int quantity){
		if(foodName == "Cake"){
			System.out.println(foodName);
			
		}
		return 50.00*quantity;
	}
	
}