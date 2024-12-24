class TrainTicket {
    long pnr;
    int age;
    String gender;
    String name;
	
	public TrainTicket(){
		System.out.println("TrainTicket constructor is invoked");
	}
	
	public void showTicket(){
		System.out.println("PNR Number:"+pnr);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Name:"+name);
		System.out.println("----------------------");
		
	}
}