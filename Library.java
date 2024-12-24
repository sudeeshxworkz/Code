  class Library {
    int libraryId;
    String address;
    String type;
    String libraryOwnerName;
	
	public Library(){
		this(1, "123 Main KT St", "Public", "Mr. Rao");
	System.out.println("Library constructor is invoked");
    }
	public Library(int l, String a, String t, String lo){
		libraryId = l;
		address = a;
		type = t;
		libraryOwnerName = lo;
	}
	public void showDetails(){
	    System.out.println("Library Id:"+libraryId);
        System.out.println("Library user address:"+address);
        System.out.println("Type:"+type);
        System.out.println("Owner Name:"+libraryOwnerName);
		System.out.println("----------------------");
}
}