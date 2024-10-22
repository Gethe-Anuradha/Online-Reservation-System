package com.reservation;
public class TrainReservation {
    private int pnr;
    private String passengerName;
    private String trainNumber;
    private String trainName;
    private String classType;
    private String journeyDate;
    private String from;
    private String to;

    public TrainReservation(int pnr, String passengerName, String trainNumber, String trainName,
                            String classType, String journeyDate, String from, String to) {
        this.pnr = pnr;
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.classType = classType;
        this.journeyDate = journeyDate;
        this.from = from;
        this.to = to;
    }

    public int getPnr() {
        return pnr;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getClassType() {
        return classType;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "PNR: " + pnr + "\nPassenger: " + passengerName + "\nTrain: " + trainNumber + " - " + trainName +
                "\nClass: " + classType + "\nJourney Date: " + journeyDate + "\nFrom: " + from + " To: " + to;
    }
}
