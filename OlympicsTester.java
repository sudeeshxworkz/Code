class OlympicsTester{
	public static void main(String[] test){
		System.out.println("Main Started");
		boolean ref = OlympicsRunner.addSports("Shooting");
		System.out.println(ref);
		OlympicsRunner.addSports("Judo");
		System.out.println(ref);
		OlympicsRunner.addSports("HandBall");
		System.out.println(ref);
		OlympicsRunner.addSports("Gymnastics");
		System.out.println(ref);
		OlympicsRunner.addSports("VolleyBall");
		System.out.println(ref);
		OlympicsRunner.addSports("Tennis");
		System.out.println(ref);
		OlympicsRunner.addSports("Badminton");
		System.out.println(ref);
		OlympicsRunner.addSports("Golf");
		System.out.println(ref);
		OlympicsRunner.addSports("Fencing");
		System.out.println(ref);
		OlympicsRunner.addSports("Hockey");
		System.out.println(ref);
		OlympicsRunner.addSports("Javelin Throw");
		System.out.println(ref);
		OlympicsRunner.addSports("Athletics");
		System.out.println(ref);
		OlympicsRunner.addSports("Boxing");
		System.out.println(ref);
		OlympicsRunner.addSports("Archery");
		System.out.println(ref);
		OlympicsRunner.addSports("Table Tennis");
		System.out.println(ref);
		
		
		
		
		
		OlympicsRunner.getSports();
		System.out.println("____________");	
		
		OlympicsRunner.updateSports("Boxing","ShotPut");
		OlympicsRunner.getSports();
		System.out.println("Main Ended");
	}
}