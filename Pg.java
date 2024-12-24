class Pg {
    String pgOwner;
    double rent;
    int noOfFloors;
    String pgAddress;
	
	public Pg(){
	System.out.println("Pg constructor is invoked");
}
    public void pgDetails(){
		System.out.println("PG Owner:"+pgOwner);
        System.out.println("PG Rent:"+rent);
        System.out.println("Number Of Floors:"+noOfFloors);
        System.out.println("PG Address:"+pgAddress);
		System.out.println("----------------------");
		
		
	}
}