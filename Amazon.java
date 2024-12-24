class Amazon{
	public static void main(String shopping[]){
	System.out.println("main started");
	String shoppingSite=signIn(95912424l,null);
	System.out.println(shoppingSite);
	System.out.println("main Ended");
	}
	public static String signIn(long mobileno,String password){
	System.out.println("The Sign-in procedure started..!");
	String notification=null;
	if(mobileno > 0 || password != null){
	System.out.println("The mobileno/password is valid");
	notification="Sign-in Successfull";
	}
	else{
	System.out.println("The mobileno/password is invalid");
	notification="Sign-in Unsuccessfull";
	}
	System.out.println("The Sign-in procedure Ends here...!");
	return notification;
	}
}