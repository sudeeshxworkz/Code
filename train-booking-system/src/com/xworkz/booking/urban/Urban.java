package com.xworkz.booking.urban;

import com.xworkz.booking.train.Train;

public class Urban extends Train {
    public void bookTrain(int trainNo,String source,String destination){
        System.out.println("Travel within 150Km distance");
        System.out.println("Source:"+source);
        System.out.println("Destination:"+destination);
    }
}
