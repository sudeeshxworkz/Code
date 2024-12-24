class Train {
    String trainNo;
    int noOfCoaches;
    String trainName;
	
	
	public Train(){
	System.out.println("Train constructor is invoked");
}
    public void trainDetails(){
		System.out.println("Train Number:"+trainNo);
        System.out.println("Number Of Coaches:"+noOfCoaches);
        System.out.println("Train Name:"+trainName);
		System.out.println("----------------------");
		
		
	}
}