class TrainRunner {
    public static void main(String[] trains) {
        Train train1 = new Train();
        train1.trainNo = "12345";
        train1.noOfCoaches = 12;
        train1.trainName = "Rajdhani Express";
        train1.trainDetails();

        Train train2 = new Train();
        train2.trainNo = "67890";
        train2.noOfCoaches = 15;
        train2.trainName = "Shatabdi Express";
        train2.trainDetails();

        Train train3 = new Train();
        train3.trainNo = "11223";
        train3.noOfCoaches = 10;
        train3.trainName = "Duronto Express";
        train3.trainDetails();
		
        Train train4 = new Train();
        train4.trainNo = "33445";
        train4.noOfCoaches = 18;
        train4.trainName = "SMVB Express";
        train4.trainDetails();

        Train train5 = new Train();
        train5.trainNo = "55667";
        train5.noOfCoaches = 14;
        train5.trainName = "Jan Shatabdi Express";
        train5.trainDetails();

        Train train6 = new Train();
        train6.trainNo = "78901";
        train6.noOfCoaches = 16;
        train6.trainName = "Maharashtra Express";
        train6.trainDetails();

        Train train7 = new Train();
        train7.trainNo = "23456";
        train7.noOfCoaches = 20;
        train7.trainName = "Wadiar Express";
        train7.trainDetails();

        Train train8 = new Train();
        train8.trainNo = "78901";
        train8.noOfCoaches = 11;
        train8.trainName = "Himalayan Queen";
        train8.trainDetails();

        Train train9 = new Train();
        train9.trainNo = "56789";
        train9.noOfCoaches = 13;
        train9.trainName = "South India Express";
        train9.trainDetails();
    }
}