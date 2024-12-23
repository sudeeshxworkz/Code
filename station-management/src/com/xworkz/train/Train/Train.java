package com.xworkz.train.Train;

public class Train {
    private int trainId;
    private String trainName;
    private String trainDepart;
    private String trainDestination;
    private double ticket;

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainDepart(String trainDepart) {
        this.trainDepart = trainDepart;
    }

    public String getTrainDepart() {
        return trainDepart;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination = trainDestination;
    }

    public String getTrainDestination() {
        return trainDestination;
    }

    public void setTicket(double ticket) {
        this.ticket = ticket;
    }

    public double getTicket() {
        return ticket;
    }

    @Override
    public boolean equals(Object obj) {
        Train rail = (Train) obj;
        boolean isSame = false;
        if(this.trainId== rail.trainId && this.trainName == rail.trainName)
            isSame = true;
        return isSame;

    }

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", trainDepart='" + trainDepart + '\'' +
                ", trainDestination='" + trainDestination + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
