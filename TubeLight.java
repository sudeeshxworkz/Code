class TubeLight {
    int id;
    String brand;
    double price;
    int voltage;
	public TubeLight(){
		System.out.println("TubeLight constructor is invoked");
	}
	public void displayDetails(){
		System.out.println("TubeLight ID"+id);
        System.out.println("TubeLight Brand"+brand);
        System.out.println("TubeLight Price"+price);
        System.out.println("TubeLight Voltage"+voltage);
		System.out.println("----------------------");
		
	}
}