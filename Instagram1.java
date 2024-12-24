class Instagram1{
	public static void main(String reels[]){
	System.out.println("Main Started..");
	String ref=signIn(776069977,"suu@123");
	System.out.println(ref);
	System.out.println("Main ended..");
	
	}
	public static String signIn(long phoneno, String password){
	System.out.println("LogIn Started");
	String msg=null;
	if(phoneno > 0 || password != null){
	System.out.println("phoneno/password is valid ");
	msg="signIn successfull";
	}
	else{
	System.out.println("phoneno/password is invalid");
	msg="signIn unsuccessfull";
	}
	System.out.println("LogIn ended");
	return msg;
	}
}