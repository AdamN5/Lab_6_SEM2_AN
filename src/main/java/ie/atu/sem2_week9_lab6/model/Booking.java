package ie.atu.sem2_week9_lab6.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booking {

    private Long id;

    @NotBlank(message = "Booking ID is required.")
    private String bookingId;

    @NotBlank(message = "Booking Tag is required.")
    private String bookingTag;

    @Email(message = "Student Email is not valid.")
    private String studentEmail;

    @NotBlank (message = "Booking Date is required.")
    private String bookingDate;

    @Positive(message = "Enter a valid start hour.")
    private Integer startHour;

    @Positive(message = "Enter duration.")
    @Min(value = 1, message = "Duration must be above 1 hour long.")
    private Integer durationHours;

    public void setId(Long id) {
        this.id = id;
    }

    public void setDurationHours(Integer durationHours) {
        this.durationHours = durationHours;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setBookingTag(String bookingTag) {
        this.bookingTag = bookingTag;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getBookingTag() {
        return bookingTag;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public Integer getStartHour() {
        return startHour;
    }

    public Integer getDurationHours() {
        return durationHours;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public Long getId() {
        return id;
    }
}