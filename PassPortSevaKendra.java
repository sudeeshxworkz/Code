class PassPortSevaKendra{
 public static void main(String[] seva){
 boolean ref = userRegistration("PO","Bengaluru","Sudeesh","P","08/08/2001","sudeeshsri882001@gmail.com",true,"sudeeshsri88","sud123","sud123","Favorite Color","Black","FGS45G");
 System.out.println(ref); 
 
 
 }
public static boolean userRegistration(String cpvLocation,String dcdrLocation,String userFirstName,String userLastName,String DOB,String email,boolean emailLoginsame,String loginId,String PWD,String confirmPWD,String hintQues,String hintAns,String captcha){
  System.out.println("The CPV Location is "+cpvLocation);
  System.out.println("The DCDR Location is "+dcdrLocation);
  System.out.println("The User First Name is "+userFirstName);
  System.out.println("The User Last Name is "+userLastName);
  System.out.println("The User Date Of Birth is "+DOB);
  System.out.println("The user Email is "+email);
  System.out.println("The User loginsame is "+emailLoginsame);
  System.out.println("The user Login ID is "+loginId);
  System.out.println("The user Password is "+PWD);
  System.out.println("The user Confirm Password is "+confirmPWD);
  System.out.println("The User Hint Question is "+hintQues);
  System.out.println("The User Hint Answer is "+hintAns);
  System.out.println("The User CAPTCHA is "+captcha);
  
  return true;
}
}