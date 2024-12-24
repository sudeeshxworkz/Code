class Harpic {
    int id;
    int quantity;
    double price;
    String color;
	
    public Harpic(){
		this(1, 500, 50.0, "Blue");
    System.out.println("Harpic Constructor is invoked");
    }
	
	public Harpic(int i, int q, double p, String c){
		id = i;
		quantity = q;
		price = p;
		color = c;
	}
	
	public void showProperty(){
	    System.out.println("Harpic ID:"+id);
        System.out.println("Harpic quantity:"+quantity);
        System.out.println("Harpic price:"+price);
        System.out.println("Harpic color:"+color);
		System.out.println("----------------------");
}
}