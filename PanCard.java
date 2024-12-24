class PanCard {
    String panNumber;
    String name;
    String fatherName;
    String dob;
	
	public PanCard(){
		this("ABCDE1234F", "Rajesh Kumar", "Suresh Kumar", "15/08/1985");
	System.out.println("PanCard constructor is invoked");
	}
	
	public PanCard(String pn, String n, String fn, String db){
		panNumber = pn;
		name = n;
		fatherName = fn;
		dob = db;
	}
	
    public void showCardDetails(){
		System.out.println("Pan Number:"+panNumber);
        System.out.println("Pan Name:"+name);
        System.out.println("Pan Father Name:"+fatherName);
        System.out.println("Date of Birth:"+dob);
		System.out.println("----------------------");
		
		
	}
}