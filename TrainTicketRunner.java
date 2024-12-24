class TrainTicketRunner {
    public static void main(String[] train) {
        TrainTicket ticket1 = new TrainTicket();
        ticket1.pnr = 1234567890L;
        ticket1.age = 25;
        ticket1.gender = "Male";
        ticket1.name = "Rohit Verma";
        ticket1.showTicket();

        TrainTicket ticket2 = new TrainTicket();
        ticket2.pnr = 1234567891L;
        ticket2.age = 30;
        ticket2.gender = "Female";
        ticket2.name = "Sneha Patil";
        ticket2.showTicket();

        TrainTicket ticket3 = new TrainTicket();
        ticket3.pnr = 1234567892L;
        ticket3.age = 45;
        ticket3.gender = "Male";
        ticket3.name = "Amit Mehta";
        ticket3.showTicket();

        TrainTicket ticket4 = new TrainTicket();
        ticket4.pnr = 1234567893L;
        ticket4.age = 20;
        ticket4.gender = "Female";
        ticket4.name = "Priya Singh";
        ticket4.showTicket();

        TrainTicket ticket5 = new TrainTicket();
        ticket5.pnr = 1234567894L;
        ticket5.age = 33;
        ticket5.gender = "Male";
        ticket5.name = "Kunal Sharma";
        ticket5.showTicket();

        TrainTicket ticket6 = new TrainTicket();
        ticket6.pnr = 1234567895L;
        ticket6.age = 28;
        ticket6.gender = "Female";
        ticket6.name = "Anjali Rao";
        ticket6.showTicket();

        TrainTicket ticket7 = new TrainTicket();
        ticket7.pnr = 1234567896L;
        ticket7.age = 52;
        ticket7.gender = "Male";
        ticket7.name = "Suresh Babu";
        ticket7.showTicket();

        TrainTicket ticket8 = new TrainTicket();
        ticket8.pnr = 1234567897L;
        ticket8.age = 22;
        ticket8.gender = "Female";
        ticket8.name = "Neha Gupta";
        ticket8.showTicket();

        TrainTicket ticket9 = new TrainTicket();
        ticket9.pnr = 1234567898L;
        ticket9.age = 40;
        ticket9.gender = "Male";
        ticket9.name = "Vikram Desai";
        ticket9.showTicket();  
    }
}