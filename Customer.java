package org.example;
import java.util.ArrayList;

public class Customer {
    private String customerID;
    private String name;
    private String email;
    private double creditScore; // Added credit score variable
    private ArrayList<Reservation> reservations; // List to hold reservations

    // Constructor
    public Customer(String customerID, String name, String email, double creditScore) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.creditScore = creditScore;
        this.reservations = new ArrayList<>(); // Initialize the reservations list
    }

    // Methods to manage reservations
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void removeReservation(String reservationID) {
        reservations.removeIf(r -> r.getReservationID() == reservationID);
    }

    // Getters and Setters for creditScore
    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

    // Other methods
    public void registerInfo() {

    }

    public void requestQuote() {

    }

    public void updateProfile() {

    }

    public void customizeFlightPrefs() {

    }

    public String getFlightDetails() {

        return "";
    }

    // Getters and Setters for other fields
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
