package cinema.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ticket", schema = "md-cinema", catalog = "")
public class TicketEntity {
    private int ticketId;
    private double ticketPrice;
    private int ticketStatus;
    private int showtimeId;
    private int bookingBookId;

    @Id
    @Column(name = "ticket_id")
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    @Basic
    @Column(name = "ticket_price")
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Basic
    @Column(name = "ticket_status")
    public int getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(int ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Basic
    @Column(name = "showtime_id")
    public int getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(int showtimeId) {
        this.showtimeId = showtimeId;
    }

    @Basic
    @Column(name = "booking_book_id")
    public int getBookingBookId() {
        return bookingBookId;
    }

    public void setBookingBookId(int bookingBookId) {
        this.bookingBookId = bookingBookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketEntity that = (TicketEntity) o;
        return ticketId == that.ticketId &&
                Double.compare(that.ticketPrice, ticketPrice) == 0 &&
                ticketStatus == that.ticketStatus &&
                showtimeId == that.showtimeId &&
                bookingBookId == that.bookingBookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, ticketPrice, ticketStatus, showtimeId, bookingBookId);
    }
}
