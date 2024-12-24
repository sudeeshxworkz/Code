class Facebook{
	
	public static void main(String[] social){
		String ref = signUP("Sudeesh","P","sudeesh@gmail.com","sud123","08/08/2001","Male");
		System.out.println(ref);
		String ref1 = signIn("sudeesh@gmail.com","sud123");
		System.out.println(ref1);
		
}
    public static String signUP(String firstName,String surName,String emailId,String pwd,String dob,String gender){
		System.out.println("Sign Up Procedure started");
		String hi = "Successfully Registered";
		System.out.println("FirstName: "+firstName);
		System.out.println("SurName: "+surName);
		System.out.println("Email ID: "+emailId);
		System.out.println("Password: "+pwd);
		System.out.println("Date Of Birth: "+dob);
		System.out.println("Gender: "+gender);
		System.out.println("Sign Up Procedure ended");
		return hi;
		
		
		
	}
	
	public static String signIn(String emailId,String password){
	System.out.println("Sign In Procedure started");
	String streaks=null;
	if(emailId != null || password != null){
	System.out.println("The email/password is vaild");
	streaks="Login Successfull..";
	}
	else{
	System.out.println("The email/password is invaild");
	streaks="Login Unsuccessfull..";
	}

	return streaks;
	}
	public static void String(String[] state){
		
	System.out.println("Sign In Procedure ended");
	}
}