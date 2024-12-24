class Wallet {
    int id;
    String brand;
    int noOfCompartments;
    String color;
	public Wallet(){
		System.out.println("Wallet constructor is invoked");
	}
	public void showDetails(){
		System.out.println("Wallet ID"+id);
        System.out.println("Wallet brand"+brand);
        System.out.println("Wallet Compartments available"+noOfCompartments);
        System.out.println("Wallet color"+color);
		System.out.println("----------------------");
		
	}
}