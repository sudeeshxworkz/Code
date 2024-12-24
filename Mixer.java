class Mixer{
static boolean isOn = true;
static int currentSpeed;
static int maxSpeed = 3;
	
public static void main(String[] grind){
	isOn = speedUp();
	isOn = speedUp();
	isOn = speedUp();
	isOn = speedUp();
	
}
public static boolean speedUp(){
	System.out.println("Increasing the Speed");
	if(isOn = true){
		if(currentSpeed<maxSpeed){
		  currentSpeed = currentSpeed+1;
		  System.out.println("The current Speed is "+currentSpeed);
		}
		else{
			System.out.println("Reached the Max Speed");
		}
	}
	else{
		System.out.println("Please Switch On The Mixer");
	}
	return true;
	
	
}}