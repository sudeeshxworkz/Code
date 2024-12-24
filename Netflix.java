class Netflix{
 public static void main (String[] chill){
	 String ref = logIn(null,null);
	 System.out.println(ref);
	 
	 
	 
	 
	 
 }

 public static String logIn(String emailId,String pwd){
	 String chills = null;
	 if(emailId != null || pwd != null){
		 System.out.println("Valid");
		 chills = ("Login Successful");
		 
	 }	
	 else{
		System.out.println("Invalid");
		chills = ("Login Unsuccessful");
	 }
	 return chills;
	 
 }







}