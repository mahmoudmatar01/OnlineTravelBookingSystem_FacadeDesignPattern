package org.design_patterns;

public class TravelBookingFacade {

    private final FlightManager flightManager;
    private final HotelReservation hotelReservation;
    private final PaymentProcessor paymentProcessor;
    private final CarRental carRental;

    public TravelBookingFacade(FlightManager flightManager, HotelReservation hotelReservation, PaymentProcessor paymentProcessor, CarRental carRental) {
        this.flightManager = flightManager;
        this.hotelReservation = hotelReservation;
        this.paymentProcessor = paymentProcessor;
        this.carRental = carRental;
    }

    public void bookTrip(Trip.TripBuilder trip){
        flightManager.bookFlight(trip.getDeparture(),trip.getDestination(),trip.getFlightDate());
        hotelReservation.reserveHotel(trip.getRoomId(),trip.getCheckInDate(),trip.getCheckOutDate());
        carRental.rentalCar(trip.getCarRentalLocation(),trip.getCarRentalStartDate(),trip.getCarRentalEndDate());
        paymentProcessor.paymentProcess(trip.getAmount(),trip.getPaymentMethod());
    }
}
