package org.design_patterns;

import java.time.LocalDateTime;

public class CarRental {

    public void rentalCar(String location, LocalDateTime startAt, LocalDateTime endAt) {
        System.out.println("Rental car started");
        System.out.println("Booking a car for location "+location+" from date "+startAt+" to date"+endAt);
    }
}
