class GalaxyRun{
static String galaxies[] = {null,null,null,null,null,null,null,null};
static int index;
public static boolean addGalaxy(String galaxyName){
	boolean galaxyAdded = false;
	if(galaxyName != null){
		System.out.println("Galaxy Present. Please Add");
		galaxies[index] = galaxyName;
		index++;
		galaxyAdded = true;
	}
	else{
		System.out.println("No More Planets Can Be Added");
	}
	return true;
}
public static void getGalaxy(){
	for(String galaxyName:galaxies){
		System.out.println(galaxyName);
	}
}
public static boolean updateGalaxy(String oldGal,String newGal){
	boolean updatedGalaxy =  false;
	for(int planets=0;planets<galaxies.length;planets++){
		if(galaxies[planets] == oldGal){
			galaxies[planets] = newGal;
			updatedGalaxy = true;
		}
	}
	if(updatedGalaxy == false)
		System.out.println("Not Found");
	return updatedGalaxy;
}
}