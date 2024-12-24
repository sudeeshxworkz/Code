class PassportSeva{
	public static void main(String govt[]){
	System.out.println("Main Started..");
	String seva=login("adbv@gmail.com","adv@123");
	System.out.println(seva);
	System.out.println("Main ended..");
	
	}
	public static String login(String loginId, String password){
	System.out.println("The login procedure started");
	String passport=null;
	if(loginId != null || password != null){
	System.out.println("loginId/password is valid ");
	passport="Login successfull";
	}
	else{
	System.out.println("loginId/password is invalid");
	passport="Login unsuccessfull";
	}
	System.out.println("The login procedure ends here...");
	return passport;
	}
}