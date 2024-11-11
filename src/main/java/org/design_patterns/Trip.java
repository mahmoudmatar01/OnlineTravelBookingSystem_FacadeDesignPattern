package org.design_patterns;

import java.time.LocalDateTime;

public class Trip {

    private final String departure;
    private final String destination;
    private final LocalDateTime flightDate;
    private final String roomId;
    private final LocalDateTime checkInDate;
    private final LocalDateTime checkOutDate;
    private final String carRentalLocation;
    private final LocalDateTime carRentalStartDate;
    private final LocalDateTime carRentalEndDate;
    private final double amount;
    private final PaymentMethodType paymentMethod;

    // all arguments constructor
    private Trip(TripBuilder tripBuilder) {
        this.departure = tripBuilder.getDeparture();
        this.destination = tripBuilder.getDestination();
        this.flightDate = tripBuilder.getFlightDate();
        this.roomId = tripBuilder.getRoomId();
        this.checkInDate = tripBuilder.getCheckInDate();
        this.checkOutDate = tripBuilder.getCheckOutDate();
        this.carRentalLocation = tripBuilder.getCarRentalLocation();
        this.carRentalStartDate = tripBuilder.getCarRentalStartDate();
        this.carRentalEndDate = tripBuilder.getCarRentalEndDate();
        this.amount = tripBuilder.getAmount();
        this.paymentMethod = tripBuilder.getPaymentMethod();
    }

    // Builder Class
    public static class TripBuilder {
        private String departure;
        private String destination;
        private LocalDateTime flightDate;
        private String roomId;
        private LocalDateTime checkInDate;
        private LocalDateTime checkOutDate;
        private String carRentalLocation;
        private LocalDateTime carRentalStartDate;
        private LocalDateTime carRentalEndDate;
        private double amount;
        private PaymentMethodType paymentMethod;

        public TripBuilder setDeparture(String departure) {
            this.departure = departure;
            return this;
        }

        public TripBuilder setDestination(String destination) {
            this.destination = destination;
            return this;

        }

        public TripBuilder setFlightDate(LocalDateTime flightDate) {
            this.flightDate = flightDate;
            return this;
        }

        public TripBuilder setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }

        public TripBuilder setCheckInDate(LocalDateTime checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }

        public TripBuilder setCheckOutDate(LocalDateTime checkOutDate) {
            this.checkOutDate = checkOutDate;
            return this;
        }

        public TripBuilder setCarRentalLocation(String carRentalLocation) {
            this.carRentalLocation = carRentalLocation;
            return this;
        }

        public TripBuilder setCarRentalStartDate(LocalDateTime carRentalStartDate) {
            this.carRentalStartDate = carRentalStartDate;
            return this;
        }

        public TripBuilder setCarRentalEndDate(LocalDateTime carRentalEndDate) {
            this.carRentalEndDate = carRentalEndDate;
            return this;
        }

        public TripBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public TripBuilder setPaymentMethod(PaymentMethodType paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public String getDeparture() {
            return departure;
        }

        public String getDestination() {
            return destination;
        }

        public LocalDateTime getFlightDate() {
            return flightDate;
        }

        public String getRoomId() {
            return roomId;
        }

        public LocalDateTime getCheckInDate() {
            return checkInDate;
        }

        public LocalDateTime getCheckOutDate() {
            return checkOutDate;
        }

        public String getCarRentalLocation() {
            return carRentalLocation;
        }

        public LocalDateTime getCarRentalStartDate() {
            return carRentalStartDate;
        }

        public LocalDateTime getCarRentalEndDate() {
            return carRentalEndDate;
        }

        public double getAmount() {
            return amount;
        }

        public PaymentMethodType getPaymentMethod() {
            return paymentMethod;
        }

        public Trip build(){
            return new Trip(this);
        }
    }

}
