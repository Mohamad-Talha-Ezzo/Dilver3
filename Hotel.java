package org.example;

public class Hotel {
    private String hotelID;
    private String roomType;
    private double price;
    private boolean isRefundable;

    // Constructor
    public Hotel(String hotelID, String roomType, double price, boolean isRefundable) {
        this.hotelID = hotelID;
        this.roomType = roomType;
        this.price = price;
        this.isRefundable = isRefundable;
    }

    // Methods
    public double getHotelQuote() {

        return 0;
    }

    public boolean bookRoom() {

        return false;
    }

    public boolean cancelBooking() {

        return false;
    }

    public String getHotelDetails() {

        return "";
    }
}
