package ie.atu.sem2_week9_lab6.repository;

import ie.atu.sem2_week9_lab6.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking, Long> {

}
