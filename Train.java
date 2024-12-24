class Train {
    String trainNo;
    int noOfCoaches;
    String trainName;
	
	
	public Train(){
		this("12345", 12, "Rajdhani Express");
	System.out.println("Train constructor is invoked");
    }
	
	public Train(String t, int n, String tn){
		trainNo = t;
		noOfCoaches = n;
		trainName = tn;
	}
    public void trainDetails(){
		System.out.println("Train Number:"+trainNo);
        System.out.println("Number Of Coaches:"+noOfCoaches);
        System.out.println("Train Name:"+trainName);
		System.out.println("----------------------");		
	}
}