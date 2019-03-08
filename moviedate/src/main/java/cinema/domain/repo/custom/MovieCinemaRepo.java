package cinema.domain.repo.custom;

import cinema.domain.Mapping.MovieCinemaMapping;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;
@Repository
public class MovieCinemaRepo extends BaseCustomRepo {
   public List<MovieCinemaMapping> getListMovieByCinema(int cinemaId){
       final String SELECT_MOVIE_BY_CINEMA = "SELECT m.movie_id, m.movie_name, m.movie_national, m.movie_description, m.movie_trailer_url, m.movie_duration, m.movie_thumb FROM movie m INNER JOIN cinema c ON m.movie_id = c.movie_movie_id WHERE c.cinema_id =:cinemaId";
       List<MovieCinemaMapping> movieCinemaMappings = null;
       StringBuilder builder = new StringBuilder();
       builder.append(SELECT_MOVIE_BY_CINEMA);

       try {

           Query query =  this.entityManager.createNativeQuery(builder.toString(), "MovieCinemaMapping");
           query.setParameter("cinemaId", cinemaId);
           movieCinemaMappings = query.getResultList();
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
       return  movieCinemaMappings;
   }

}
