# Travel Booking System
This Travel Booking System is a streamlined application for customers to manage reservations for flights, hotels, and car rentals. It allows users to create profiles, request quotes, hold reservations, and complete bookings. Sales departments can verify customer creditworthiness to ensure transaction security.
## Table of Contents
- [Features](#features)
- [User Stories](#user-stories)
- [Class Diagram](#class-diagram)
- [System Constraints](#system-constraints)
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
## Features
- Customer profile management and updates
- Quote requests for flights, hotels, and car rentals
- Flight, hotel, and car rental bookings with price and preference customization
- Temporary reservations with a holding period
- Sales department verification of customer creditworthiness
## User Stories
### Customer
1. **Profile Update After Transaction**  
   *As a customer, I want my profile to be updated after completing a transaction in order to receive future discounts and offers.*
2. **Register Personal Information**  
   *As a customer, I want to register my personal information in order to complete my booking.*
3. **Request Flight Price Quote**  
   *As a customer, I want to request a price quote for a flight in order to compare options for my trip.*
4. **Select Flight Preferences**  
   *As a customer, I want to select flight preferences such as seat type and meals in order to customize my travel experience.*
5. **Reserve Flight Temporarily**  
   *As a customer, I want to reserve a flight temporarily for two days in order to hold the quoted price without immediate payment.*
6. **Request Car Rental Price Quote**  
   *As a customer, I want to request a price quote for a car rental in order to compare different rental options.*
7. **Book Car Rental at Non-refundable Price**  
   *As a customer, I want to book a car rental at a non-refundable lower price in order to save money.*
8. **Request Hotel Price Quote**  
   *As a customer, I want to request a price quote for a hotel in order to find accommodation options that fit my budget.*
9. **Cancel or Change Hotel Booking**  
   *As a customer, I want to cancel or change my hotel booking with a full refund if done at least two days before the start date in order to have flexibility in my plans.*
### Sales Department
1. **Verify Customer Creditworthiness**  
   *As a Sales Department, I want to verify the customer’s creditworthiness in order to decide whether to proceed with the booking.*
## Class Diagram
The following class diagram represents the system's main entities, their attributes, methods, and relationships.
![Class Diagram](class_diagram.png)
### Classes Overview
1. **Customer**
   - Attributes: `customerID`, `name`, `email`
   - Methods: `registerInfo()`, `requestQuote()`, `updateProfile()`, `customizeFlightPrefs()`, `getFlightDetails()`
2. **Flight**
   - Attributes: `flightID`, `seatType`, `price`, `isBooked`
   - Methods: `getFlightQuote()`, `bookFlight()`, `cancelFlight()`, `confirmBooking()`, `holdReservation()`
3. **Reservation**
   - Attributes: `reservationID`, `dateReserved`, `isTemporary`, `customerID`, `flightID`, `hotelID`, `rentID`
   - Methods: `holdReservation()`, `confirmReservation()`, `cancelReservation()`, `getReservationDetails()`
4. **Hotel**
   - Attributes: `hotelID`, `roomType`, `price`, `isRefundable`
   - Methods: `getHotelQuote()`, `bookRoom()`, `cancelBooking()`, `getHotelDetails()`
5. **CarRental**
   - Attributes: `rentID`, `carType`, `price`, `isRefundable`
   - Methods: `getRentalQuote()`, `bookCar()`, `cancelRental()`, `getCarDetails()`, `isCarAvailable()`
6. **SalesDepartment**
   - Attributes: `deptID`
   - Methods: `verifyCredit()`
### Class Relationships
- **Customer** has a one-to-many relationship with **Reservation**.
- **Reservation** can be associated with **Flight**, **Hotel**, and **CarRental**.
- **Reservation** is linked to **SalesDepartment** for credit verification purposes.
## System Constraints
```ocl
-- 1. Reservation Date Consistency
context Reservation
inv DateNotPast: self.dateReserved >= Date::now()
-- 2. Unique Customer ID
context Customer
inv UniqueCustomerID: Customer.allInstances()->forAll(c1, c2 | c1 <> c2 implies c1.customerID <> c2.customerID)
-- 3. Reservation-Flight Relationship
context Reservation
inv FlightMustBeBooked: self.isTemporary = false implies self.flight.isBooked = true
-- 4. Association with Sales Department
context Reservation
inv AssociatedWithSalesDept: self.salesDept->notEmpty()
-- 5. Flight Booking Validation
context Flight
inv FlightCannotBeBookedIfTemporary: self.reservation.isTemporary = false implies self.isBooked = true
-- 6. Refundable Hotel Booking
context Hotel
inv HotelRefundable: self.isRefundable = true implies self.price > 0
-- 7. Car Rental Availability
context CarRental
inv CarRentalAvailability: self.isCarAvailable = true implies self.bookCar() = true

Team:
Saif Abed
Mohammed Talha
Hamdan Al sabahi
Haitham wail omer
Abdulrahman Ibrahim
Omar Abu Zied
Yahya Al Agah