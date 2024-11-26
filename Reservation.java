package org.example;

import java.time.LocalDateTime;

public class Reservation {
    private String reservationID;
    private LocalDateTime dateReserved;
    private boolean isTemporary;
    private String customerID;
    private String flightID;
    private String hotelID;
    private String rentalID;

    // Constructor
    public Reservation(String reservationID, LocalDateTime dateReserved, boolean isTemporary,
                       String customerID, String flightID, String hotelID, String rentalID) {
        this.reservationID = reservationID;
        this.dateReserved = dateReserved;
        this.isTemporary = isTemporary;
        this.customerID = customerID;
        this.flightID = flightID;
        this.hotelID = hotelID;
        this.rentalID = rentalID;
    }

    // Methods
    public boolean holdReservation() {

        return false;
    }

    public String getReservationID() {
        String x = reservationID;
        return x;
    }
    public boolean confirmReservation() {

        return false;
    }

    public boolean cancelReservation() {

        return false;
    }

    public String getReservationDetails() {

        return "";
    }
}
