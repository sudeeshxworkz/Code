package org.xworkz.cinema;

import org.xworkz.cinema.bookmyshow.BookMyShow;
import org.xworkz.cinema.theatre.PVR;

import java.awt.print.Book;

public class Tester {
    public static void main(String[] args) {

        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.setBalance(1000.00);
        System.out.println("Available Balance:"+bookMyShow.getBalance());
        bookMyShow.buyTicket("Venom");
        bookMyShow.buyTicket("SpiderMan");
        bookMyShow.cancelTicket("Venom");

        BookMyShow user1 = new BookMyShow();
        user1.setBalance(100.00);
        user1.buyTicket("Venom");




    }
}
