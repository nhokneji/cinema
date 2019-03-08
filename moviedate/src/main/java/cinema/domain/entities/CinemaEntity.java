package cinema.domain.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cinema", schema = "md-cinema", catalog = "")
public class CinemaEntity {
    private int cinemaId;
    private String cinemaName;
    private String cinemaAddress;
    private int movieMovieId;
    List<MovieEntity> movieEntities;

    public void setMovieEntities(List<MovieEntity> movieEntities) {
        this.movieEntities = movieEntities;
    }

    @Id
    @Column(name = "cinema_id")
    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    @Basic
    @Column(name = "cinema_name")
    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    @Basic
    @Column(name = "cinema_address")
    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    @Basic
    @Column(name = "movie_movie_id")
    public int getMovieMovieId() {
        return movieMovieId;
    }

    public void setMovieMovieId(int movieMovieId) {
        this.movieMovieId = movieMovieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaEntity that = (CinemaEntity) o;
        return cinemaId == that.cinemaId &&
                movieMovieId == that.movieMovieId &&
                Objects.equals(cinemaName, that.cinemaName) &&
                Objects.equals(cinemaAddress, that.cinemaAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinemaId, cinemaName, cinemaAddress, movieMovieId);
    }
}
