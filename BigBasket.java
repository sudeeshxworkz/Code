class BigBasket{
public static void main(String[] doordelivery){

	double price = search("Maggi",2);
	System.out.println(price);
    price=search("TopRamen",2);
	System.out.println(price);

	
	
}
public static double search(String foodName,int quantity){
	if(foodName == "Maggi"){
		return 14*quantity;
	}
	if(foodName == "TopRamen"){
		return 10*quantity;
	}
	else{
		System.out.println("Food Name Not Found");
	}
	return 0.0;
}

}