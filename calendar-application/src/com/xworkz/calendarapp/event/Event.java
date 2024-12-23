package com.xworkz.calendarapp.event;
import com.xworkz.calendarapp.constants.EventType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Event {

    private  int eventId;
    private String who;
    private String startDate;
    private String endDate;
    private String description;
    private EventType EventType;
    private boolean allDayEvent;
}
