class TrainRunner {
    public static void main(String[] trains) {
        Train train1 = new Train();
        train1.trainDetails();

        Train train2 = new Train("67890", 15, "Shatabdi Express");
        train2.trainDetails();

        Train train3 = new Train("11223", 10, "Duronto Express");
        train3.trainDetails();
		
        Train train4 = new Train("33445", 18, "SMVB Express");
        train4.trainDetails();

        Train train5 = new Train("55667", 14, "Jan Shatabdi Express");
        train5.trainDetails();

        Train train6 = new Train("78901", 16, "Maharashtra Express");
        train6.trainDetails();

        Train train7 = new Train("23456", 20, "Wadiar Express");
        train7.trainDetails();

        Train train8 = new Train("78901", 11, "Himalayan Queen");
        train8.trainDetails();

        Train train9 = new Train("56789", 13, "South India Express");
        train9.trainDetails();
    }
}