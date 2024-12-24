class ElectricityBill {
    String rrNo;
    String accountId;
    String address;
	
public ElectricityBill(){
	System.out.println("ElectricityBill Constructor is invoked");
}
public void showBill(){
	    System.out.println("RR Number:"+rrNo);
        System.out.println("Account ID:"+accountId);
        System.out.println("Address:"+address);
		System.out.println("----------------------"); 
	
}
}