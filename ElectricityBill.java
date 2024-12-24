class ElectricityBill {
    String rrNo;
    String accountId;
    String address;
	
    public ElectricityBill(){
		this("RR001", "AC1001", "123 Main St, San City, Mysuru");
	System.out.println("ElectricityBill Constructor is invoked");
    }
	
	public ElectricityBill(String rn, String ac, String ad){
		rrNo = rn;
		accountId = ac;
		address = ad;
	}
    public void showBill(){
	    System.out.println("RR Number:"+rrNo);
        System.out.println("Account ID:"+accountId);
        System.out.println("Address:"+address);
		System.out.println("----------------------"); 
	
    }
}