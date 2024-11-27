package org.example;

public class ReservationManager {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("C001", "Jane Doe", "janeisher@gmail.com", 750.5);

        // Access and print the customer's credit score
        System.out.println("Customer Credit Score: " + customer.getCreditScore());

        // Update credit score
        customer.setCreditScore(800.0);
        System.out.println("Updated Credit Score: " + customer.getCreditScore());
    }
}
