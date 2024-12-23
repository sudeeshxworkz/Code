package com.xworkz.train;

import com.xworkz.train.Train.Train;
import com.xworkz.train.station.KSR;

public class Tester {
    public static void main(String[] args) {


        Train rail = new Train();
        KSR station = new KSR();
        System.out.println(rail);

       rail.setTrainName("SMVT bengaluru");
       rail.setTrainDepart("Smvb");
       rail.setTrainDestination("murdeshwar");
       rail.setTicket(165.00);
        System.out.println(rail);

        Train rail1 = new Train();
        rail1.setTrainName("SMVT bengaluru");
        rail1.setTrainDepart("Smvb");
        rail1.setTrainDestination("murdeshwar");
        rail1.setTicket(165.00);
        System.out.println(rail1);

        System.out.println(rail.equals(rail1));




       station.addTrain(rail);
       station.getTrain();

    }
}
