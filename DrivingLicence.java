class DrivingLicence {
    int dlNo;
    String name;
    String dob;
    String validTill;
    String bloodGroup;
    String fatherName;
    String rtoOfficeNumber;
public DrivingLicence(){
	System.out.println("DrivingLicence Constructor is invoked");
}
public void showDriverDetails(){
	    System.out.println("Driving License Number:"+dlNo);
        System.out.println("Driver Name:"+name);
        System.out.println("Driver Date of birth:"+dob);
        System.out.println("Valid till:"+validTill);
        System.out.println("Driver Blood group:"+bloodGroup);
        System.out.println("Driver Father name:"+fatherName);
        System.out.println("Driver RTO Number:"+rtoOfficeNumber);
		System.out.println("----------------------");
}	
}