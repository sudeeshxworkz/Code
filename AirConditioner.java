class AirConditioner{
	static boolean isOn = true;
	static int currentTemp;
	static int maxTemp=5;
	static int minTemp;
	
	public static void main(String[] ac){
		for(int air=0;air<7;air++){
            increaseTemp();	

                      }
		
		
	}
	public static void increaseTemp(){
		if(isOn == true){
			if(currentTemp<maxTemp){
			currentTemp=currentTemp+1;
			System.out.println("Temp increased");
			}                                                                    
		else{
			System.out.println("Reached max temp");
		}	

			
		}
		else{
			System.out.println("Please On The Ac");
		}
		
	}
}