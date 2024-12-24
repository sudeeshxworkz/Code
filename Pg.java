class Pg {
    String pgOwner;
    double rent;
    int noOfFloors;
    String pgAddress;
	
	public Pg(){
		this("Mr. Sharma", 5000, 3, "#237, P and T Layout, Rachenhalli Main Road, Thanisandra Main Road, Thanisandra, Bangalore - 560045");
	System.out.println("Pg constructor is invoked");
	}
	
	public Pg(String pg, double r, int n, String pa){
		pgOwner = pg;
		rent = r;
		noOfFloors = n;
		pgAddress = pa;
	}
	
    public void pgDetails(){
		System.out.println("PG Owner:"+pgOwner);
        System.out.println("PG Rent:"+rent);
        System.out.println("Number Of Floors:"+noOfFloors);
        System.out.println("PG Address:"+pgAddress);
		System.out.println("----------------------");
		
		
	}
}