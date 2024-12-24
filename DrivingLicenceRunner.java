class DrivingLicenceRunner {
    public static void main(String[] drive) {
        DrivingLicence drive1 = new DrivingLicence();
        drive1.showDriverDetails();

        DrivingLicence drive2 = new DrivingLicence(102, "Priya Sharma", "05/03/1992", "05/03/2032", "O+", "Vikram Sharma", "RTO124");
        drive2.showDriverDetails();

        DrivingLicence drive3 = new DrivingLicence(103, "Anita Singh", "10/10/1991", "10/10/2031", "A+", "Rajesh Singh", "RTO125");
        drive3.showDriverDetails();

        DrivingLicence drive4 = new DrivingLicence(104, "Rohit Mehta", "25/12/1985", "25/12/2025", "AB+", "Manoj Mehta", "RTO126");
        drive4.showDriverDetails();

        DrivingLicence drive5 = new DrivingLicence(105, "Pooja Verma", "17/07/1993", "17/07/2033", "O-", "Sanjay Verma", "RTO127");
        drive5.showDriverDetails();

        DrivingLicence drive6 = new DrivingLicence(106, "Karan Kapoor", "23/09/1990", "23/09/2030", "B-", "Ajay Kapoor", "RTO128");
        drive6.showDriverDetails();
		
        DrivingLicence drive7 = new DrivingLicence(107, "Anil Desai", "15/05/1988", "15/05/2028", "A-", "Ramesh Desai", "RTO129");
        drive7.showDriverDetails();

        DrivingLicence drive8 = new DrivingLicence(108, "Sakshi Patel", "11/02/1995", "11/02/2035", "B+", "Kiran Patel", "RTO130");
        drive8.showDriverDetails();

        DrivingLicence drive9 = new DrivingLicence(109, "Meera Rao", "30/08/1987", "30/08/2027", "AB-", "Shankar Rao", "RTO131");
        drive9.showDriverDetails();
    }
}