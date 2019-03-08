package cinema.domain.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "showtime", schema = "md-cinema")
public class ShowtimeEntity {
    private int showtimeId;
    private Integer showtimeQuality;
    private Date showtimeStartTime;
    private int showtimePartTime;
    private int roomId;
    private int cinemaId;
    private int movieMovieId;
    private int ticketTicketId;

    @Id
    @Column(name = "showtime_id")
    public int getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(int showtimeId) {
        this.showtimeId = showtimeId;
    }

    @Basic
    @Column(name = "showtime_quality")
    public Integer getShowtimeQuality() {
        return showtimeQuality;
    }

    public void setShowtimeQuality(Integer showtimeQuality) {
        this.showtimeQuality = showtimeQuality;
    }

    @Basic
    @Column(name = "showtime_start_time")
    public Date getShowtimeStartTime() {
        return showtimeStartTime;
    }

    public void setShowtimeStartTime(Date showtimeStartTime) {
        this.showtimeStartTime = showtimeStartTime;
    }

    @Basic
    @Column(name = "showtime_part_time")
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    public int getShowtimePartTime() {
        return showtimePartTime;
    }

    public void setShowtimePartTime(int showtimePartTime) {
        this.showtimePartTime = showtimePartTime;
    }

    @Basic
    @Column(name = "room_id")
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Basic
    @Column(name = "cinema_id")
    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    @Basic
    @Column(name = "movie_movie_id")
    public int getMovieMovieId() {
        return movieMovieId;
    }

    public void setMovieMovieId(int movieMovieId) {
        this.movieMovieId = movieMovieId;
    }

    @Basic
    @Column(name = "ticket_ticket_id")
    public int getTicketTicketId() {
        return ticketTicketId;
    }

    public void setTicketTicketId(int ticketTicketId) {
        this.ticketTicketId = ticketTicketId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowtimeEntity that = (ShowtimeEntity) o;
        return showtimeId == that.showtimeId &&
                showtimePartTime == that.showtimePartTime &&
                roomId == that.roomId &&
                cinemaId == that.cinemaId &&
                movieMovieId == that.movieMovieId &&
                ticketTicketId == that.ticketTicketId &&
                Objects.equals(showtimeQuality, that.showtimeQuality) &&
                Objects.equals(showtimeStartTime, that.showtimeStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showtimeId, showtimeQuality, showtimeStartTime, showtimePartTime, roomId, cinemaId, movieMovieId, ticketTicketId);
    }
}
