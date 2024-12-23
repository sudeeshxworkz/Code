package com.xworkz.train.station;

import com.xworkz.train.Train.Train;

public class KSR {
    Train rail;
    public boolean addTrain(Train rail){
        boolean isAdded = false;
        if(rail!= null){
            if(rail.getTrainName()!=null){
                this.rail = rail;
                isAdded = true;
            }
        }
        return isAdded;
    }
    public void getTrain
            (){
        System.out.println("Artist Name is : "+ rail.getTrainName());
        System.out.println("Artist Song Name is : "+ rail.getTrainDepart());
        System.out.println("Overall Streamed : "+ rail.getTrainDestination());
        System.out.println("Overall Streamed : "+ rail.getTicket());


    }
}
