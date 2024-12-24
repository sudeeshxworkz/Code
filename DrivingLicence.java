class DrivingLicence {
    int dlNo;
    String name;
    String dob;
    String validTill;
    String bloodGroup;
    String fatherName;
    String rtoOfficeNumber;
	
    public DrivingLicence(){
		this(101, "Rahul Kumar", "01/01/1990", "01/01/2030", "B+", "Suresh Kumar", "RTO123");
	System.out.println("DrivingLicence Constructor is invoked");
    }
	
	public DrivingLicence(int dl, String n, String d, String vt, String bg, String fn, String rn) {
		dlNo = dl;
		name = n;
		dob = d;
		validTill = vt;
		bloodGroup = bg;
		fatherName = fn;
		rtoOfficeNumber = rn;
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