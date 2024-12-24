class EatSureApp{
	public static double search(String foodName){
		if(foodName=="Chicken Biryani"){
			return 259.0;
		}
		if(foodName=="Veg Biryani"){
			return 75.0;
		}
		if(foodName=="Chicken Tikka Masala"){
			return 155.0;
		}
		if(foodName=="Chicken Tandoori"){
			return 90.0;
		}
		if(foodName=="Naan Bread"){
			return 90.0;
		}
		else{
			System.out.println(foodName + " not found ");
			return 0.0;
				}
			}
	public static double search(String foodName,int quantity){
		if(foodName=="Chicken Biryani"){
			return 259.0 * quantity;
		}
		if(foodName=="Veg Biryani"){
			return 75.0 * quantity;
		}
		if(foodName=="Chicken Tikka Masala"){
			return 155.0 * quantity;
		}
		if(foodName=="Chicken Tandoori"){
			return 90.0 * quantity;
		}
		if(foodName=="Naan Bread"){
			return 90.0 * quantity;
		}
		else{
			System.out.println(foodName + " not found ");
			return 0.0;
				}
			}
}