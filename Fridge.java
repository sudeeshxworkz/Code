class Fridge{

static boolean isOn = true;
	static int currentCool;
	static int maxCool = 4;
	
public static void main(String[] freezer){
	isOn = coolUp();
	isOn = coolUp();
	isOn = coolUp();
	isOn = coolUp();
	isOn = coolUp();
	
}
public static boolean coolUp(){
	System.out.println("Increasing the Temperature");
	if(isOn = true){
		if(currentCool<maxCool){
		  currentCool = currentCool+1;
		  System.out.println("The current cooling temperature is "+currentCool);
		}
		else{
			System.out.println("Reached the Max cooling Temperature");
		}
	}
	else{
		System.out.println("Please Switch On The Fridge");
	}
	return true;
	
	
}
}