class Bread {
    String brandName;
    int noOfSlices;
    String type;
	public Bread(){
	System.out.println("Bread Constructor is invoked");
}
	
	public void showBread(){
		System.out.println("Bread brand name is:"+brandName);
        System.out.println("No of slices:"+noOfSlices);
        System.out.println("Bread type is:"+type);
		System.out.println("----------------------");

	}
}