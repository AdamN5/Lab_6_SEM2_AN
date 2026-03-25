package ie.atu.sem2_week9_lab6.service;

import ie.atu.sem2_week9_lab6.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final List<Booking> bookings = new java.util.ArrayList<>();
    private long nextId = 1;

    public Booking addBooking(Booking booking) {
        booking.setId(nextId++);
        bookings.add(booking);
        return booking;
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }
}