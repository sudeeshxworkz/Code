class GalaxyTest{
	public static void main(String[] universe){
		boolean ref = GalaxyRun.addGalaxy("Mercury");
		System.out.println(ref);
		GalaxyRun.addGalaxy("Venus");
		System.out.println(ref);
		GalaxyRun.addGalaxy("Earth");
		System.out.println(ref);
		GalaxyRun.addGalaxy("Mars");
		System.out.println(ref);
		GalaxyRun.addGalaxy("Jupyter");
		System.out.println(ref);
		GalaxyRun.addGalaxy("Saturn");
		System.out.println(ref);
		GalaxyRun.addGalaxy("Uranus");
		System.out.println(ref);
		GalaxyRun.addGalaxy("Neptune");
		System.out.println(ref);
		
		
		GalaxyRun.getGalaxy();
		GalaxyRun.updateGalaxy("Neptune","Pluto");
		GalaxyRun.getGalaxy();
		
		
	}
}