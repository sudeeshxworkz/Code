class BillRunner{
	public static void main(String run[]){
	Bill ref = new Bill();
	ref.setBillId(123);
    int billId	 = ref.getBillId();
	System.out.println("Bill id is:"+billId);
	 
	ref.setBillAmount(20.00);
	double billAmount = ref.getBillAmount();
	System.out.println("Bill Amount is:"+billAmount);
		
	ref.setBillName("Goods");
    String billName = ref.getBillName(); 
	System.out.println("Bill Name is:"+billName);	
	
	ref.setBillAddress("Indiranagar");
    String billAdd = ref.getBillAddress(); 
	System.out.println("Bill Address is:"+billAdd);	
	
	ref.setBillPaid(true);
    boolean billpaid = ref.getBillPaid(); 
	System.out.println("Bill paid  is:"+billpaid);	
	
	
	}
}