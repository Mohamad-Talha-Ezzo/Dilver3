package org.example;

public class Flight {
    private String flightID;
    private String seatType;
    private double price;
    private boolean isBooked;

    // Constructor
    public Flight(String flightID, String seatType, double price, boolean isBooked) {
        this.flightID = flightID;
        this.seatType = seatType;
        this.price = price;
        this.isBooked = isBooked;
    }

    // Methods
    public double getFlightQuote() {

        return 0;
    }

    public boolean bookFlight() {

        return false;
    }

    public boolean cancelFlight() {

        return false;
    }

    public boolean confirmBooking() {

        return false;
    }

    public boolean holdReservation() {

        return false;
    }
}
