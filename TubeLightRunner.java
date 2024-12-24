class TubeLightRunner {
    public static void main(String[] tube) {
        TubeLight tubeLight1 = new TubeLight();
        tubeLight1.displayDetails();

        TubeLight tubeLight2 = new TubeLight(2, "Crompton", 120.0, 240);
        tubeLight2.displayDetails();

        TubeLight tubeLight3 = new TubeLight(3, "Wipro", 140.0, 230);
        tubeLight3.displayDetails();
		
		TubeLight tubeLight4 = new TubeLight(4, "Eveready", 160.0, 280);
        tubeLight4.displayDetails();
		
		TubeLight tubeLight5 = new TubeLight(5, "Havells", 220.0, 320);
        tubeLight5.displayDetails();
		
		TubeLight tubeLight6 = new TubeLight(6, "Syska", 280.0, 460);
        tubeLight6.displayDetails();
		
		TubeLight tubeLight7 = new TubeLight(7, "Nortek Essenza", 180.0, 72);
        tubeLight7.displayDetails();
		
		TubeLight tubeLight8 = new TubeLight(8, "Bajaj", 150.0, 120);
        tubeLight8.displayDetails();
		
		TubeLight tubeLight9 = new TubeLight(9, "Orient", 250.0, 200);
        tubeLight9.displayDetails();

        
    }
}