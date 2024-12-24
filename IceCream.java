class IceCream {
    int id;
    String brand;
    String flavors;
    String type;
    int quantity;

	public IceCream(){
		this(1, "Amul", "Vanilla", "Cup", 100);
	System.out.println("IceCream constructor is invoked");
	}
	
	public IceCream(int i, String b, String f, String t, int q ){
		id = i;
		brand = b;
		flavors = f;
		type = t;
		quantity = q;
	}
    public void showIceMenu(){
	    System.out.println("Ice cream Id:"+id);
        System.out.println("Ice cream brand:"+brand);
        System.out.println("Ice cream flavors:"+flavors);
        System.out.println("Ice cream type:"+type);
        System.out.println("Ice cream quantity:"+quantity);
		System.out.println("----------------------");
}
}
 