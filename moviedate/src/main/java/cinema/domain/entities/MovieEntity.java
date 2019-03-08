package cinema.domain.entities;

import cinema.domain.Mapping.MovieCinemaMapping;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie", schema = "md-cinema")
@SqlResultSetMappings(
        {
                @SqlResultSetMapping(name = "MovieCinemaMapping", classes = @ConstructorResult(
                        targetClass = MovieCinemaMapping.class,
                        columns= {
                                @ColumnResult(name = "movie_id", type = Integer.class),
                                @ColumnResult(name = "movie_name", type = String.class),
                                @ColumnResult(name = "movie_national", type = String.class),
                                @ColumnResult(name = "movie_trailer_url", type = String.class),
                                @ColumnResult(name = "movie_duration", type = Integer.class),
                                @ColumnResult(name = "movie_thumb", type = String.class),
                                @ColumnResult(name = "movie_movie_id", type = Integer.class)
                        }
                )),

        }
)
public class MovieEntity {
    private int movieId;
    private String movieName;
    private String movieNational;
    private String movieDescription;
    private String movieTrailerUrl;
    private int movieDuration;
    private String movieThumb;
    private int directorDerectorId;
    private int categoriesCategoryId;
    private int actorActorId;
    private int roomRoomId;

    @Id
    @Column(name = "movie_id")
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "movie_name")
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Basic
    @Column(name = "movie_national")
    public String getMovieNational() {
        return movieNational;
    }

    public void setMovieNational(String movieNational) {
        this.movieNational = movieNational;
    }

    @Basic
    @Column(name = "movie_description")
    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    @Basic
    @Column(name = "movie_trailer_url")
    public String getMovieTrailerUrl() {
        return movieTrailerUrl;
    }

    public void setMovieTrailerUrl(String movieTrailerUrl) {
        this.movieTrailerUrl = movieTrailerUrl;
    }

    @Basic
    @Column(name = "movie_duration")
    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    @Basic
    @Column(name = "movie_thumb")
    public String getMovieThumb() {
        return movieThumb;
    }

    public void setMovieThumb(String movieThumb) {
        this.movieThumb = movieThumb;
    }

    @Basic
    @Column(name = "director_derector_id")
    public int getDirectorDerectorId() {
        return directorDerectorId;
    }

    public void setDirectorDerectorId(int directorDerectorId) {
        this.directorDerectorId = directorDerectorId;
    }

    @Basic
    @Column(name = "categories_category_id")
    public int getCategoriesCategoryId() {
        return categoriesCategoryId;
    }

    public void setCategoriesCategoryId(int categoriesCategoryId) {
        this.categoriesCategoryId = categoriesCategoryId;
    }

    @Basic
    @Column(name = "actor_actor_id")
    public int getActorActorId() {
        return actorActorId;
    }

    public void setActorActorId(int actorActorId) {
        this.actorActorId = actorActorId;
    }

    @Basic
    @Column(name = "room_room_id")
    public int getRoomRoomId() {
        return roomRoomId;
    }

    public void setRoomRoomId(int roomRoomId) {
        this.roomRoomId = roomRoomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieEntity that = (MovieEntity) o;
        return movieId == that.movieId &&
                movieDuration == that.movieDuration &&
                directorDerectorId == that.directorDerectorId &&
                categoriesCategoryId == that.categoriesCategoryId &&
                actorActorId == that.actorActorId &&
                roomRoomId == that.roomRoomId &&
                Objects.equals(movieName, that.movieName) &&
                Objects.equals(movieNational, that.movieNational) &&
                Objects.equals(movieDescription, that.movieDescription) &&
                Objects.equals(movieTrailerUrl, that.movieTrailerUrl) &&
                Objects.equals(movieThumb, that.movieThumb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, movieName, movieNational, movieDescription, movieTrailerUrl, movieDuration, movieThumb, directorDerectorId, categoriesCategoryId, actorActorId, roomRoomId);
    }
}
