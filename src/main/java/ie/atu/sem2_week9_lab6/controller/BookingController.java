package ie.atu.sem2_week9_lab6.controller;

import ie.atu.sem2_week9_lab6.model.Booking;
import ie.atu.sem2_week9_lab6.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping("/addBooking")
    public ResponseEntity<Booking> addBooking(@Valid @RequestBody Booking booking) {
        return ResponseEntity.status(201).body(bookingService.addBooking(booking));
    }
    @GetMapping("/allBookings")
    public ResponseEntity<List<Booking>> getAllBookings()
    {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }

}