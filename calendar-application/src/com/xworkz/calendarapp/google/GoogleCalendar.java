package com.xworkz.calendarapp.google;

import com.xworkz.calendarapp.calendar.Calendar;
import com.xworkz.calendarapp.constants.EventType;
import com.xworkz.calendarapp.event.Event;


public class GoogleCalendar implements Calendar {

    Event event [] = null;
    public GoogleCalendar(int size){
        event = new Event[size];
    }
    int index;

    @Override
    public boolean addEvent(Event event) {
        boolean isEventAdded = false;
        if(event.getEventId() > 0 &&
                event.getEventType() != null &&
                event.getWho() != null &&
                event.isAllDayEvent() &&
                event.getDescription() != null &&
                event.getStartDate() != null &&
                event.getEndDate() != null)
        {
            this.event[index++] = event;
            isEventAdded = true;

        }
        return isEventAdded;
    }

    @Override
    public void getEvent() {
        if (event != null) {
            for (Event i : event) {
                if(i != null){
                    System.out.println(i.getEventId());
                    System.out.println(i.getWho());
                    System.out.println(i.getEventType());
                    System.out.println(i.getStartDate());
                    System.out.println(i.getEndDate());
                    System.out.println(i.getDescription());
                    System.out.println("================================");
                }
            }
        }
        else {
            System.out.println("The Data is not Available");
        }
    }

    @Override
    public void getById(int eventId) {
        if(eventId > 0 ){
       for (Event event : this.event){
           if(event.getEventId() == eventId)
               System.out.println(event);

       }
            System.out.println("=================================");
        }
    }

    @Override
    public Event getEventByWho(String eWho) {
        Event returnEvent = null;
        for (Event event : event){
            if (event.getWho().equals(eWho)){
                returnEvent = event;
                System.out.println("Event Id: " + event.getEventId());
                System.out.println("Event by Who: " + event.getWho());
                System.out.println("Event Start date: " + event.getStartDate() );
                System.out.println("Event End date: " + event.getEndDate() );
                System.out.println("Event Type: "+ event.getEventType());
                System.out.println("Event Description: " + event.getDescription());
                System.out.println("All Day Event: " + event.isAllDayEvent());
                System.out.println("---------------------");
                break;
            }
        }
        if (returnEvent == null)
            System.out.println("Given Event with " + eWho + " not found");

        return returnEvent;
    }

    @Override
    public Event getEventByEventType(EventType eventType) {
        Event eventToBeReturned = null;
        for (Event type : event){
            if(type.getEventType() == eventType){
                eventToBeReturned = type;
            }
        }
        if (eventToBeReturned == null) System.out.println("Given Event Type " + eventType + " not found");
        return eventToBeReturned;
    }

    @Override
    public String getWhoByStartDate(String startDate) {
        String getWho = null;
        for(Event event : event){
            if(event.getStartDate() == startDate){
                getWho = event.getWho();


            }
        }
        if(getWho == null){
            System.out.println("Name not found");
        }
        return  getWho;
    }

    @Override
    public String getDescriptionByWho(String wh) {
        String getDescription = null;
        for(Event event : event){
            if(event.getWho().equals(wh)){
                getDescription = event.getDescription();
            }
        }
        if(wh == null){
            System.out.println("Name not found");
        }
        return getDescription;
    }

    public void addEvent() {

    }
}

