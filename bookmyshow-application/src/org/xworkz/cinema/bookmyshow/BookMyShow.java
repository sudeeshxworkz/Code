package org.xworkz.cinema.bookmyshow;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookMyShow {
BookMyShow show[] = null;


    public BookMyShow(){
        System.out.println("BookMyShow cons is invoked");
    }
     private double balance;

     public String screenOne ;
     public String screenTwo ;


    public void buyTicket(String movieName){
        //boolean isTicketBooked = false;
        if(movieName == screenOne && balance>=300){
            balance = balance - 200;
            System.out.println(balance);

            System.out.println("Successfully Booked Tickets for :"+screenOne);
        } else if (movieName == screenTwo) {
            balance = balance - 250;
            System.out.println(balance);

            System.out.println("Successfully Booked Tickets for :"+screenTwo);

        } else{
            System.out.println("Ticket is not Booked Please Check your Balance");
        }
       // return isTicketBooked;

    }
    public void cancelTicket(String movieName){
        //boolean isTicketCancelled = false;
        if(movieName == screenOne && balance>=300){
            balance = balance + 200;
            System.out.println("Succesfully Cancelled the ticket for "+screenOne);
            System.out.println(balance);
        } else if(movieName == screenTwo){
            balance = balance + 250;
            System.out.println("Succesfully Cancelled the ticket for "+screenTwo);
            System.out.println(balance);
        }
        else {
            System.out.println("Ticket cancellation is unsuccessfull.. Please contact");
        }
        //return isTicketCancelled;
    }
}
