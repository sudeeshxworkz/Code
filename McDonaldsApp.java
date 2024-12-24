 class McDonaldsApp{
		public static double search(String foodName){
			if(foodName=="Egg McMuffin"){
			return 99.0;
			}
			if(foodName=="Big Breakfast"){
			return 65.0;
			}
			if(foodName=="Hotcakes"){
			return 155.0;
			}
			if(foodName=="Sausage McMuffin"){
			return 60.0;
			}
			if(foodName=="Hash Browns"){
			return 95.0;
			}
		else{
				System.out.println(foodName + " not found ");
				return 0.0;
			}
		}
		
		public static double search(String foodName,int quantity){
			if(foodName=="Egg McMuffin"){
			return 99.0 * quantity;
			}
			if(foodName=="Big Breakfast"){
			return 65.0 * quantity;
			}
			if(foodName=="Hotcakes"){
			return 155.0 * quantity;
			}
			if(foodName=="Sausage McMuffin"){
			return 60.0 * quantity;
			}
			if(foodName=="Hash Browns"){
			return 95.0 * quantity;
			}else{
					System.out.println(foodName + " not found ");
					return 0.0;
				}
		}
}