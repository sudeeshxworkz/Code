package com.xworkz.calendarapp.calendar;
import com.xworkz.calendarapp.constants.EventType;
import com.xworkz.calendarapp.event.Event;

import java.util.Arrays;


public interface Calendar  {



    public boolean addEvent(Event event);
    public  void  getEvent();
    public void getById(int eventId);
    public Event getEventByWho(String eWho);
    public Event getEventByEventType(EventType eventType);
    public String getWhoByStartDate(String startDate);
    public String getDescriptionByWho(String wh);

}
