class Harpic {
    int id;
    int quantity;
    double price;
    String color;
public Harpic(){
System.out.println("Harpic Constructor is invoked");
}
public void showProperty(){
	    System.out.println("Harpic ID:"+id);
        System.out.println("Harpic quantity:"+quantity);
        System.out.println("Harpic price:"+price);
        System.out.println("Harpic color:"+color);
		System.out.println("----------------------");
}
}