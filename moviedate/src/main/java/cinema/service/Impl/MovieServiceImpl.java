package cinema.service.Impl;

import cinema.domain.Mapping.MovieCinemaMapping;
import cinema.domain.Response.BaseResponse;
import cinema.domain.Response.GetArrayResponse;
import cinema.domain.Response.SingleItemResponse;
import cinema.domain.entities.CinemaEntity;
import cinema.domain.entities.MovieEntity;
import cinema.domain.entities.ShowtimeEntity;
import cinema.domain.repo.MovieRepo;
import cinema.domain.repo.ShowTimeRepo;
import cinema.domain.repo.custom.MovieCinemaRepo;
import cinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepo movieRepo;
    @Autowired
    ShowTimeRepo showTimeRepo;

    @Autowired
    MovieCinemaRepo movieCinemaRepo;

    @Override
    public BaseResponse findMovieByCinemaId(int cinemaId) {
        GetArrayResponse<MovieCinemaMapping> response = new GetArrayResponse<>();
        response.setSuccess(movieCinemaRepo.getListMovieByCinema(cinemaId));
        return response;
    }

    @Override
    public BaseResponse ShowTime(int movieId, int partDate) {
        GetArrayResponse<ShowtimeEntity> response = new GetArrayResponse<>();
        try {
            List<ShowtimeEntity> showtimeEntities = showTimeRepo.findByMovieMovieIdAndShowtimePartTime(movieId, partDate);
            if(showtimeEntities !=null){
                response.setSuccess(showtimeEntities);
            }
        }catch (Exception e){
            response.setFailed();
        }
        return response;
    }

    @Override
    public BaseResponse findByName(String name) {
        SingleItemResponse<CinemaEntity> response = new SingleItemResponse<>();
       try {
           CinemaEntity cinemaEntity = movieRepo.findByMovieName(name);
           if(cinemaEntity != null){
               response.setSuccess(cinemaEntity);
           }
       }catch (Exception e){
           response.setFailed();
       }
        return response;
    }

    @Override
    public void save(MovieEntity movieEntity) {
        movieRepo.save(movieEntity);
    }

    @Override
    public BaseResponse findAll() {
        GetArrayResponse<MovieEntity> response = new GetArrayResponse<>();
        try {
            List<MovieEntity> movieEntities = movieRepo.findAll();
            if (movieEntities != null){
                response.setSuccess(movieEntities);
            }
        }catch (Exception e){
            response.setFailed();
        }
        return response;
    }

    @Override
    public BaseResponse findById(Integer id) {
        SingleItemResponse<MovieEntity> response = new SingleItemResponse<>();
        try {
            Optional<MovieEntity> movieEntity = movieRepo.findById(id);
            if (movieEntity !=null){
                response.setSuccess(movieEntity.get());
            }
        }catch (Exception e){
            response.setFailed();
        }
        return response;
    }
}
