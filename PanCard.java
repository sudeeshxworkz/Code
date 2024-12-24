class PanCard {
    String panNumber;
    String name;
    String fatherName;
    String dob;
	
	public PanCard(){
	System.out.println("PanCard constructor is invoked");
}
    public void showCardDetails(){
		System.out.println("Pan Number:"+panNumber);
        System.out.println("Pan Name:"+name);
        System.out.println("Pan Father Name:"+fatherName);
        System.out.println("Date of Birth:"+dob);
		System.out.println("----------------------");
		
		
	}
}