package com.xworkz.booking.train;

public class Train {
    public int trainNo;
    public String source;
    public String destination;

    public void bookTrain(int trainNo,String source,String destination){
        System.out.println("Source:"+source);
        System.out.println("Destination:"+destination);
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }
}
