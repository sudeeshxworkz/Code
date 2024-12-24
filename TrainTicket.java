class TrainTicket {
    long pnr;
    int age;
    String gender;
    String name;
	
	public TrainTicket(){
		this(1234567890L, 25, "Male", "Rohit Verma");
		System.out.println("TrainTicket constructor is invoked");
	}
	
	public TrainTicket(long p, int a, String g, String n){
		pnr = p;
		age = a;
		gender = g;
		name = n;
	}
	public void showTicket(){
		System.out.println("PNR Number:"+pnr);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Name:"+name);
		System.out.println("----------------------");
		
	}
}