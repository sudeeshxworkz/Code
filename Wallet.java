class Wallet {
    int id;
    String brand;
    int noOfCompartments;
    String color;
	
	public Wallet(){
		this(1, "Montblanc", 5, "Black");
		System.out.println("Wallet constructor is invoked");
	}
	
	public Wallet(int i, String b, int n, String c){
		id = i;
		brand = b;
		noOfCompartments = n;
		color = c;
	}
	
	public void showDetails(){
		System.out.println("Wallet ID "+id);
        System.out.println("Wallet brand "+brand);
        System.out.println("Wallet Compartments available "+noOfCompartments);
        System.out.println("Wallet color "+color);
		System.out.println("----------------------");
		
	}
}