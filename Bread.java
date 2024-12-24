class Bread {
    String brandName;
    int noOfSlices;
    String type;
	
	public Bread(){
		this("Britannia", 10, "Whole Wheat");
	System.out.println("Bread Constructor is invoked");
    }
	
	public Bread(String bName, int n, String t) {
		brandName = bName;
		noOfSlices = n;
		type = t;
	}
	
	public void showBread(){
		System.out.println("Bread brand name is:"+brandName);
        System.out.println("No of slices:"+noOfSlices);
        System.out.println("Bread type is:"+type);
		System.out.println("----------------------");

	}
}