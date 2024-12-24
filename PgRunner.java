class PgRunner {
    public static void main(String[] pg) {
        Pg payingGuest1 = new Pg();
        payingGuest1.pgOwner = "Mr. Sharma";
        payingGuest1.rent = 5000;
        payingGuest1.noOfFloors = 3;
        payingGuest1.pgAddress = "#237, P and T Layout, Rachenhalli Main Road, Thanisandra Main Road, Thanisandra, Bangalore - 560045";
        payingGuest1.pgDetails();

        Pg payingGuest2 = new Pg();
        payingGuest2.pgOwner = "Ms. Verma";
        payingGuest2.rent = 6000;
        payingGuest2.noOfFloors = 4;
        payingGuest2.pgAddress = "#18 1st Cross, Veernapalya, Nagawara, Near Country Inn and Suites By Carlson, Bangalore - 560045";
        payingGuest2.pgDetails();

        Pg payingGuest3 = new Pg();
        payingGuest3.pgOwner = "Mr. Gupta";
        payingGuest3.rent = 4500;
        payingGuest3.noOfFloors = 2;
        payingGuest3.pgAddress = "No 835, 11th Cross, Veerannapalya Main Road, Govindpura Main Road, Nagawara, Bangalore - 560045 Near Hilton Bengaluru Embassy Manyata Business Park";
        payingGuest3.pgDetails();
		
        Pg payingGuest4 = new Pg();
		payingGuest4.pgOwner = "Mr. Mehta";
        payingGuest4.rent = 5500;
        payingGuest4.noOfFloors = 3;
        payingGuest4.pgAddress = "Sri Ganesha Gents PG, MV Extension, Hoskote, Bangalore - 562114";
        payingGuest4.pgDetails();

        Pg payingGuest5 = new Pg();
        payingGuest5.pgOwner = "Ms. Kapoor";
        payingGuest5.rent = 4800;
        payingGuest5.noOfFloors = 5;
        payingGuest5.pgAddress = "#388/1 9th Cross Vyalikaval, Hbcs Layout, Nagawara, Bangalore - 560045";
        payingGuest5.pgDetails();

        Pg payingGuest6 = new Pg();
        payingGuest6.pgOwner = "Mr. Jain";
        payingGuest6.rent = 7000;
        payingGuest6.noOfFloors = 4;
        payingGuest6.pgAddress = "No 56-163-08, Gangadhar Nagar, Jp Nagar, Bangalore - 560078";
        payingGuest6.pgDetails();

        Pg payingGuest7 = new Pg();
        payingGuest7.pgOwner = "Ms. Rao";
        payingGuest7.rent = 6200;
        payingGuest7.noOfFloors = 3;
        payingGuest7.pgAddress = "No.140, MIG, 5th Block, Khb Block-koramangala, Bangalore - 560095";
        payingGuest7.pgDetails();

        Pg payingGuest8 = new Pg();
        payingGuest8.pgOwner = "Mr. Desai";
        payingGuest8.rent = 5400;
        payingGuest8.noOfFloors = 6;
        payingGuest8.pgAddress = "No 85, 4th Cross, Jp Nagar 5th Phase, Bangalore - 560078";
        payingGuest8.pgDetails();

        Pg payingGuest9 = new Pg();
        payingGuest9.pgOwner = "Ms. Patel";
        payingGuest9.rent = 4900;
        payingGuest9.noOfFloors = 5;
        payingGuest9.pgAddress = "No 949, 21st Cross, 5th Main, Sector 7, Hsr Layout, Bangalore - 560102";
        payingGuest9.pgDetails();
    }
}