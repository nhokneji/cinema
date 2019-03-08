package cinema.domain.Mapping;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieCinemaMapping {
    private int movieId;
    private String movieName;
    private String movieNational;
    private String movieDescription;
    private String movieTrailerUrl;
    private int movieDuration;
    private String movieThumb;

    private int idCinemaMovie;

    public MovieCinemaMapping(int movieId, String movieName, String movieNational, String movieDescription, String movieTrailerUrl, int movieDuration, String movieThumb, int idCinemaMovie) {

        this.movieId = movieId;
        this.movieName = movieName;
        this.movieNational = movieNational;
        this.movieDescription = movieDescription;
        this.movieTrailerUrl = movieTrailerUrl;
        this.movieDuration = movieDuration;
        this.movieThumb = movieThumb;
        this.idCinemaMovie = idCinemaMovie;
    }

    @Override
    public String toString() {
        return "MovieCinemaMapping{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieNational='" + movieNational + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", movieTrailerUrl='" + movieTrailerUrl + '\'' +
                ", movieDuration=" + movieDuration +
                ", movieThumb='" + movieThumb + '\'' +
                ", idCinemaMovie=" + idCinemaMovie +
                '}';
    }
}
