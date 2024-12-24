class PanCardRunner {
    public static void main(String[] pan) {
        PanCard pan1 = new PanCard();
        pan1.showCardDetails();


        PanCard pan2 = new PanCard("FGHIJ5678K", "Priya Sharma", "Vikram Sharma", "12/05/1990");
        pan2.showCardDetails();


        PanCard pan3 = new PanCard("KLMNO9012P", "Rahul Verma", "Sanjay Verma", "21/09/1988");
        pan3.showCardDetails();


        PanCard pan4 = new PanCard("PQRST3456U", "Anita Desai", "Ramesh Desai", "30/11/1987");
        pan4.showCardDetails();

        PanCard pan5 = new PanCard("UVWXY7890Z", "Karan Mehta", "Manoj Mehta", "05/06/1993");
        pan5.showCardDetails();


        PanCard pan6 = new PanCard("ABCFG1122D", "Sakshi Patel", "Kiran Patel", "22/04/1991");
        pan6.showCardDetails();


        PanCard pan7 = new PanCard("DEHIJ3344K", "Rohit Singh", "Ajay Singh", "17/03/1986");
        pan7.showCardDetails();



        PanCard pan8 = new PanCard("JKLMN5566P", "Pooja Gupta", "Rajesh Gupta", "11/12/1989");
        pan8.showCardDetails();



        PanCard pan9 = new PanCard("OPQRS7788U", "Meera Rao", "Shankar Rao", "29/02/1984");
        pan9.showCardDetails();


    }
}