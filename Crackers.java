class Crackers{
	int crackerID;
	String crackerName;
	double price;
	String crackerType;
	
public Crackers(){
	this(1,"Rocket");
	System.out.println("No arg Constructor is invoked");
}

public Crackers(int crackerID,String crackerName){
	this(100.00,"Blast");
	this.crackerID = crackerID;
	this.crackerName = crackerName;
	System.out.println("Constructor is invoked i.e int and str");	
	
}
public Crackers(double price,String crackerType){
	
	this.price = price;
	this.crackerType = crackerType;
    System.out.println("Constructor is invoked i.e double and str");
}
public void showBlast(){
	System.out.println("Cracker ID is:"+crackerID);
	System.out.println("Cracker Name is:"+crackerName);
	System.out.println("Cracker Price is:"+price);
	System.out.println("Cracker Type is:"+crackerType);
}
}