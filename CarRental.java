package org.example;

public class CarRental {
    private String rentalID;
    private String carType;
    private double price;
    private boolean isRefundable;

    // Constructor
    public CarRental(String rentalID, String carType, double price, boolean isRefundable) {
        this.rentalID = rentalID;
        this.carType = carType;
        this.price = price;
        this.isRefundable = isRefundable;
    }

    // Methods
    public double getRentalQuote() {

        return 0;
    }

    public boolean bookCar() {

        return false;
    }

    public boolean cancelRental() {

        return false;
    }

    public String getCarDetails() {

        return "";
    }

    public boolean isCarAvailable() {

        return false;
    }
}
