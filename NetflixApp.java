class NetflixApp{
	public static void main(String movie[]){
	System.out.println("Main Started..");
	String movies=login("suuuuuuu@gmail.com","sud@123",921604600l);
	System.out.println(movies);
	System.out.println("Main ended..");
	
	}
	public static String login(String email,String password,long phoneno){
	System.out.println("The Login procedure started");
	String notify=null;
	if(email != null || password != null || phoneno >0){
	System.out.println("Email/password/phoneno is valid ");
	notify="login successfull";
	}
	else{
	System.out.println("Email/password/phoneno is invalid");
	notify="login unsuccessfull";
	}
	System.out.println("The Login procedure ends here...");
	return notify;
	