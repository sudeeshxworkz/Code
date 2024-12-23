package com.xworkz.calendarapp;

import com.xworkz.calendarapp.constants.EventType;
import com.xworkz.calendarapp.event.Event;
import com.xworkz.calendarapp.google.GoogleCalendar;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

       /* Event event = new Event();
        event.setEventId(1);
        event.setEventType(EventType.travel);
        event.setWho("Sudeesh");
        event.setStartDate("20/11/2024");
        event.setEndDate("21/11/2024");
        event.setAllDayEvent(true);
        event.setDescription("Going to Mysuru");

        GoogleCalendar calendar = new GoogleCalendar();
        calendar.addEvent(event);

        Event event1 = new Event();
        event1.setEventId(2);
        event1.setEventType(EventType.travel);
        event1.setWho("Prajwal");
        event1.setStartDate("25/11/2024");
        event1.setEndDate("26/11/2024");
        event1.setAllDayEvent(true);
        event1.setDescription("Traveling out");
        calendar.addEvent(event1);

        Event event2 = new Event();
        event2.setEventId(3);
        event2.setEventType(EventType.hospital);
        event2.setWho("Bilwesh");
        event2.setStartDate("20/11/2024");
        event2.setEndDate("21/11/2024");
        event2.setAllDayEvent(true);
        event2.setDescription("I am having a fever.");
        calendar.addEvent(event2);

        Event event5 = new Event();
        event5.setEventId(4);
        event5.setEventType(EventType.birthday);
        event5.setWho("Arjun");
        event5.setStartDate("26/11/2024");
        event5.setEndDate("26/11/2024");
        event5.setAllDayEvent(true);
        event5.setDescription("My Birthday on this day");

        calendar.addEvent(event5);

        Event event7 = new Event();
        event7.setEventId(5);
        event7.setEventType(EventType.birthday);
        event7.setWho("Rajesh");
        event7.setStartDate("21/11/2024");
        event7.setEndDate("22/11/2024");
        event7.setAllDayEvent(true);
        event7.setDescription("There is an birthday party");
        calendar.addEvent(event7);

      calendar.getEventByWho("Sudeesh");
      Event returnedEvent=calendar.getEventByEventType(EventType.hospital);
      //calendar.displayDetails(returnedEvent);

      calendar.getEventByWho("Arjun");

     // String who = calendar.getWhoByStartDate("20/11/2024");
       // System.out.println(who);

       //String ref =  calendar.getDescriptionByWho("Sudeesh");
        //System.out.println(ref);


        //EventType ref = calendar.getEventTypeByEventId(1);
        //System.out.println(ref);

        //boolean ref = calendar.getAllDayEventByEventType(EventType.travel);
        //System.out.println(ref);

      //  calendar.updateStartDateAndEndDateByWho("Sudeesh","20/12/2024","21/12/2024");
        //calendar.getEvent();

       // calendar.updateDescriptionByWho("Sudeesh","Going to Chennai" );
        calendar.getDescriptionByWho("Sudeesh");*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of events to be added");
        int size = scanner.nextInt();
        GoogleCalendar googleCalendar = new GoogleCalendar(size);


        for (int i = 0; i < size; i++) {
            Event event = new Event();
            System.out.println("Enter the event ID");
            event.setEventId(scanner.nextInt());
            System.out.println("Enter Who");
            event.setWho(scanner.next());
            System.out.println("Enter start date");
            event.setStartDate(scanner.next());
            System.out.println("Enter end data");
            event.setEndDate(scanner.next());
            System.out.println("Enter description");
            scanner.nextLine();
            event.setDescription(scanner.nextLine());
            System.out.println("Enter the event type");
            event.setEventType(EventType.valueOf(scanner.next().toLowerCase()));
            System.out.println("is all day event?");
            event.setAllDayEvent(scanner.nextBoolean());
            googleCalendar.addEvent(event);

        }
        googleCalendar.getEvent();
        String value = null;
        do {
            System.out.println("----------------");
            System.out.println("press 1 to get all events");
            System.out.println("press 2 to get event by who");
            System.out.println("press 3 to get event by start date");
            System.out.println("press 4 Enter id");
            System.out.println("press 5 to get event by end date");
            System.out.println("press 6 to get description by who");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    googleCalendar.getEvent();
                    break;
                case 2:
                    System.out.println("Enter who");
                    scanner.nextLine();
                   String who = scanner.next();
                   googleCalendar.getEventByWho(who);
                    break;
                case 3:
                    System.out.println("Enter the start date");
                    String whoo = googleCalendar.getWhoByStartDate(scanner.next());
                    googleCalendar.getWhoByStartDate(whoo);
                    break;
                case 4:
                    System.out.println("Enter the id");
                    int id = scanner.nextInt();
                    googleCalendar.getById(id);
                    break;
                case 5:
                    System.out.println("Enter the end date");
                    String whooo = googleCalendar.getWhoByStartDate(scanner.next());
                    googleCalendar.getWhoByStartDate(whooo);
                    break;
                case 6:
                    System.out.println("Enter who?");
                    String des = googleCalendar.getDescriptionByWho(scanner.next());
                    System.out.println(des);
                default:
                    System.out.println("Please enter the valid option");
            }
            System.out.println("Do you want to continue?(yes/no)");
            value = scanner.next();
        } while (value.equalsIgnoreCase("yes"));
        System.out.println("Thank you for co-operating");

    }
}

