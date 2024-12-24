class OlympicsRunner{
	static String sports[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addSports(String sportName){
		System.out.println("Method Started");
		boolean sportsAdded = false;
		if(sportName != null){
			System.out.println("Please Add");
			sports[index] = sportName;
			index++;
			sportsAdded = true;
			}
		else{
			System.out.println("Not Available");
		}
		System.out.println("Method Ended");
		return true;
	}
	
	public static void getSports(){
	for(String sportName:sports){
		System.out.println(sportName);
	}
}
    public static boolean updateSports(String oldSport,String newSport){
		boolean isUpdated = false;
		for(int game=0;game<sports.length;game++){
			if(sports[game] == oldSport){
				sports[game] = newSport;
				isUpdated = true;
			}
		}
		if(isUpdated == false)
			System.out.println("Not Found");
		return isUpdated;
	}


}