class PgRunner {
    public static void main(String[] pg) {
        Pg payingGuest1 = new Pg();
        payingGuest1.pgDetails();

        Pg payingGuest2 = new Pg("Ms. Verma", 6000, 4, "#18 1st Cross, Veernapalya, Nagawara, Near Country Inn and Suites By Carlson, Bangalore - 560045");
        payingGuest2.pgDetails();

        Pg payingGuest3 = new Pg("Mr. Gupta", 4500, 2, "No 835, 11th Cross, Veerannapalya Main Road, Govindpura Main Road, Nagawara, Bangalore - 560045 Near Hilton Bengaluru Embassy Manyata Business Park");
        payingGuest3.pgDetails();
		
        Pg payingGuest4 = new Pg("Mr. Mehta", 5500, 3, "Sri Ganesha Gents PG, MV Extension, Hoskote, Bangalore - 562114");
        payingGuest4.pgDetails();

        Pg payingGuest5 = new Pg("Ms. Kapoor", 4800, 5, "#388/1 9th Cross Vyalikaval, Hbcs Layout, Nagawara, Bangalore - 560045");
        payingGuest5.pgDetails();

        Pg payingGuest6 = new Pg("Mr. Jain", 7000, 4, "No 56-163-08, Gangadhar Nagar, Jp Nagar, Bangalore - 560078");
        payingGuest6.pgDetails();

        Pg payingGuest7 = new Pg("Ms. Rao", 6200, 3, "No.140, MIG, 5th Block, Khb Block-koramangala, Bangalore - 560095");
        payingGuest7.pgDetails();

        Pg payingGuest8 = new Pg("Mr. Desai", 5400, 6, "No 85, 4th Cross, Jp Nagar 5th Phase, Bangalore - 560078");
        payingGuest8.pgDetails();

        Pg payingGuest9 = new Pg("Ms. Patel", 4900, 5, "No 949, 21st Cross, 5th Main, Sector 7, Hsr Layout, Bangalore - 560102");
        payingGuest9.pgDetails();
    }
}