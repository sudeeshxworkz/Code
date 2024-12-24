class InductionStove{
static boolean isOn = true;
	static int currentHeat;
	static int maxHeat = 8;
	
public static void main(String[] cook){
	isOn = heatUp();
	isOn = heatUp();
	isOn = heatUp();
	isOn = heatUp();
	isOn = heatUp();
	isOn = heatUp();
	isOn = heatUp();
	isOn = heatUp();
	isOn = heatUp();
	isOn = heatUp();
	
}
public static boolean heatUp(){
	System.out.println("Increasing the Heat");
	if(isOn = true){
		if(currentHeat<maxHeat){
		  currentHeat = currentHeat+1;
		  System.out.println("The current temperature is "+currentHeat);
		}
		else{
			System.out.println("Reached the Max Heat");
		}
	}
	else{
		System.out.println("Please Switch On The Stove");
	}
	return true;
	
	
}}