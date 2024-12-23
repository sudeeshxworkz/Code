package com.xworkz.bcci.cricket;

import com.xworkz.bcci.sport.Sport;

public class Cricket extends Sport {
    public Cricket(){
        super();
        System.out.println("Cricket cons is invoked");
    }


    public void addTime(String time){
        System.out.println("Time Scheduled:"+time);
    }

}
