package com.xworkz.flightticket.book;

import com.xworkz.flightticket.ixigoapp.Ixigo;

import java.util.Scanner;

public class BookTicket {
    public static void main(String[] args) {
       System.out.println("main started");
        Scanner scanner = new Scanner(System.in);
        Ixigo ixigo = new Ixigo();

        System.out.println("Enter the flight ID");
        int iD = scanner.nextInt();
        ixigo.setFlightId(iD);

        System.out.println("Enter the flight name");
        String name = scanner.next();
        ixigo.setFlightName(name);

        System.out.println("Boarding");
        String board = scanner.next();
        ixigo.setBoarding(board);

        System.out.println("Destination");
        String dest = scanner.next();
        ixigo.setDestination(dest);

        System.out.println("Departure");
        String depart = scanner.next();
        ixigo.setDeparture(depart);

        System.out.println("Return Flight");
        String ret = scanner.next();
        ixigo.setReturnFlight(ret);

        System.out.println("Class Type");
        String clss = scanner.next();
        ixigo.setClassType(clss);

        System.out.println("Ticket Price");
        float price = scanner.nextFloat();
        ixigo.setTicketPrice(price);

        System.out.println("Is Passport avail");
        boolean passport = scanner.nextBoolean();
        ixigo.setPassportAvail(passport);

        System.out.println("Journey Time");
        String time = scanner.next();
        ixigo.setJourneyTime(time);

        System.out.println(ixigo);







        System.out.println("main ended");
    }
}
