package com.xworkz.booking.metro;

import com.xworkz.booking.train.Train;

public class Metro extends Train {

    public void bookTrain(int trainNo,String source,String destination){
        System.out.println("Travel within City");
        System.out.println("Source:"+source);
        System.out.println("Destination:"+destination);
    }
}
