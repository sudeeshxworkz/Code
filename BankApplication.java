class BankApplication{

 public static void main(String[] cashh){
 boolean ref = details("Sudeesh","P",23,776069977,1342245657532l,"245ADF12","SadanandaNagar NGEF layout blr 560038","SadanandaNagar NGEF layout blr 560038","Savings Account","Pattu","Sumathi","Male","Kasturi Nagar");
 System.out.println(ref);
 }
 
 public static boolean details(String firstName,String lastName,int age,long phoneNumber,long adhaarNumber,String panNumber,String currentAddress,String currentAddressAsPermanentAddress,String accountType,String fatherName,String motherName,String gender,String branch){
       System.out.println("First Name :"+firstName);
	   System.out.println("Last Name :"+lastName);
	   System.out.println("Age :"+age);
	   System.out.println("Phone Number :"+phoneNumber);
	   System.out.println("Adhaar Number :"+adhaarNumber);
	   System.out.println("Pan Number :"+panNumber);
	   System.out.println("Current Address :"+currentAddress);
	   System.out.println("Current Address as Permanent Address :"+currentAddressAsPermanentAddress);
	   System.out.println("Account Type :"+accountType);
	   System.out.println("Father Name :"+fatherName);
	   System.out.println("Mother Name :"+motherName);
	   System.out.println("Gender :"+gender);
	   System.out.println("Branch :"+branch);
 return true;





 }
}