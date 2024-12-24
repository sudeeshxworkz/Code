class IceCream {
    int id;
    String brand;
    String flavors;
    String type;
    int quantity;

public IceCream(){
	System.out.println("IceCream constructor is invoked");
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
 