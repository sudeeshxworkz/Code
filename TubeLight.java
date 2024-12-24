class TubeLight {
    int id;
    String brand;
    double price;
    int voltage;
	
	public TubeLight(){
		this(1, "Phillips", 100.0, 220);
		System.out.println("TubeLight constructor is invoked");
	}
	
	public TubeLight(int i, String b, double p, int v){
		id = i;
		brand = b;
		price = p;
		voltage = v;
	}
	public void displayDetails(){
		System.out.println("TubeLight ID "+id);
        System.out.println("TubeLight Brand "+brand);
        System.out.println("TubeLight Price "+price);
        System.out.println("TubeLight Voltage "+voltage);
		System.out.println("----------------------");
		
	}
}