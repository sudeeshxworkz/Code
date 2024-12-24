  class Library {
    int libraryId;
    String address;
    String type;
    String libraryOwnerName;
	
	public Library(){
	System.out.println("Library constructor is invoked");
}
public void showDetails(){
	    System.out.println("Library Id:"+libraryId);
        System.out.println("Library user address:"+address);
        System.out.println("Type:"+type);
        System.out.println("Owner Name:"+libraryOwnerName);
		System.out.println("----------------------");
}
}