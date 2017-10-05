package com.kodilla.good.patterns.challenges.flycompany;

public class Flight {

    String flightFROM;
    String flightTO;

    public Flight(String flightFROM, String flightTO) {
        this.flightFROM = flightFROM;
        this.flightTO = flightTO;
    }

    public String getFlightFROM() {
        return flightFROM;
    }

    public String getFlightTO() {
        return flightTO;
    }
}
