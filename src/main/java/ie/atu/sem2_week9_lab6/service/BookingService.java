package ie.atu.sem2_week9_lab6.service;

import ie.atu.sem2_week9_lab6.model.Booking;
import ie.atu.sem2_week9_lab6.repository.BookingRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private List<Booking> bookings;
    private final BookingRepo bookingRepo;

    public BookingService(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public Booking addBooking(Booking booking) {

        bookings = bookingRepo.findAll();

        bookingRepo.save(booking);
        return booking;
    }

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }
}