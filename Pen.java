class Pen{
String brandName;
double price;
String material;
String type;
public Pen(){
	System.out.println("Pen Constructor is invoked");
}
public Pen(String brandName,double price,String material,String type){
	    this.brandName = brandName;
		this.price = price;
		this.material = material;
		this.type = type;
	
	
	
}
public void displayDetails(){
	    System.out.println("The Brand Name is:"+brandName);
		System.out.println("Price of the Pen is:"+price);
		System.out.println("Material type of the Pen:"+material);
		System.out.println("Type of the Pen is:"+type);
		System.out.println("----------------");
		
}

}
