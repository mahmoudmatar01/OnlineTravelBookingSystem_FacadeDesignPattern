# OnlineTravelBookingSystem_FacadeDesignPattern

This project demonstrates the **Facade Design Pattern** through an online travel booking system, where users can book a complete travel package that includes flight reservations, hotel bookings, car rentals, and payment processing through a unified `TravelBookingFacade` interface.

## Project Structure

The project is organized as follows:

1. **Subsystem Classes**
   - **CarRental**: Handles the car rental booking with a `rentalCar()` method that takes a location and rental dates.
   - **FlightManager**: Manages flight bookings with a `bookFlight()` method for setting departure, destination, and flight date.
   - **HotelReservation**: Reserves a hotel room with a `reserveHotel()` method that includes room ID, check-in, and check-out dates.
   - **PaymentProcessor**: Processes payments with the specified amount and payment method type through `paymentProcess()`.

2. **Trip (TripBuilder)**
   - Represents the travel package details, including information about the flight, hotel, car rental, and payment.
   - Follows the **Builder Pattern** to allow the creation of a `Trip` object with optional and required fields.

3. **TravelBookingFacade**
   - Acts as the **Facade** interface, providing a simplified method (`bookTrip()`) to handle the booking of all travel elements (flight, hotel, car rental, and payment) in a single call.
   - Orchestrates calls to each subsystem component, encapsulating the complexity of multiple services into a cohesive method for booking a complete travel package.

4. **Main (Driver Class)**
   - Sets up a sample trip with details for each aspect of the travel plan and then uses the `TravelBookingFacade` to book the trip.

## How It Works

1. **Facade Design Pattern**:
   - The `TravelBookingFacade` provides a single interface to handle complex interactions between multiple subsystems (flight booking, hotel reservation, car rental, and payment).
   - By using the facade, clients can interact with a simplified interface, while the facade manages the interactions and dependencies between the various subsystems.

2. **Builder Pattern in Trip**:
   - `TripBuilder` is used to construct a `Trip` object with all necessary information, allowing clients to set specific details without directly handling each subsystem.

## Sample Output

Running the `Main` class will output a booking sequence, similar to the following:

```plaintext
Booking flight started
Booking flight with departure: Trip departure and destination: Trip destination at [Flight Date]
Room hotel reservation started
Reserve a room with id Room_123 and the check-in date [Check-In Date] and check-out date [Check-Out Date]
Rental car started
Booking a car for location Car rental location from date [Car Rental Start Date] to date [Car Rental End Date]
Payment processing started
Processing payment of amount: 123000 with VISA
```

## Key Takeaways
- Facade Design Pattern: Simplifies complex systems by providing a single entry point, enhancing usability and reducing the need for direct subsystem management.
- Builder Pattern: Ensures that all necessary details for booking a trip are encapsulated in the `Trip` object before calling the `TravelBookingFacade`, enhancing the flexibility and readability of object creation.
- Modular Design: Each component (Flight, Hotel, Car Rental, Payment) is independently managed but orchestrated together through the `TravelBookingFacade`, making it easier to expand or modify individual services.

- ## Usage
1. Clone the repository and navigate to the project directory.
2. Compile the project files.
3. Run the `Main` class to see how the Facade Pattern simplifies the travel booking process.
