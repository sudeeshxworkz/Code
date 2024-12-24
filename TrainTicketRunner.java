class TrainTicketRunner {
    public static void main(String[] train) {
        TrainTicket ticket1 = new TrainTicket();
        ticket1.showTicket();

        TrainTicket ticket2 = new TrainTicket(1234567891L, 30, "Female", "Sneha Patil");
        ticket2.showTicket();

        TrainTicket ticket3 = new TrainTicket(1234567892L, 45, "Male", "Amit Mehta");
        ticket3.showTicket();

        TrainTicket ticket4 = new TrainTicket(1234567893L, 20, "Female", "Priya Singh");
        ticket4.showTicket();

        TrainTicket ticket5 = new TrainTicket(1234567894L, 33, "Male", "Kunal Sharma");
        ticket5.showTicket();

        TrainTicket ticket6 = new TrainTicket(1234567895L, 28, "Female", "Anjali Rao");
        ticket6.showTicket();

        TrainTicket ticket7 = new TrainTicket(1234567896L, 52, "Male", "Suresh Babu");
        ticket7.showTicket();

        TrainTicket ticket8 = new TrainTicket(1234567897L, 22, "Female", "Neha Gupta");
        ticket8.showTicket();

        TrainTicket ticket9 = new TrainTicket(1234567898L, 40, "Male", "Vikram Desai");
        ticket9.showTicket();  
    }
}