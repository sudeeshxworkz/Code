class Ac{
	static boolean isOn;
	static int currentTemp;
	static int maxTemp = 5;
	
public static void main(String[] cool){
	isOn = tempUp();
	isOn = tempUp();
	isOn = tempUp();
	isOn = tempUp();
	isOn = tempUp();
	isOn = tempUp();
	
}


public static boolean tempUp(){
	System.out.println("Increasing the Temperature");
	if(isOn == true){
		if(currentTemp<maxTemp){
		  currentTemp = currentTemp+1;
		  System.out.println("The current temperature is "+currentTemp);
		}
		else{
			System.out.println("Reached the Max Temperature");
		}
	}
	else{
		System.out.println("Please Switch On The Ac");
	}
	return true;
	
	
}

}