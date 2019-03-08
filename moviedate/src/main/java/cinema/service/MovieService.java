package cinema.service;

import cinema.domain.Response.BaseResponse;
import cinema.domain.entities.MovieEntity;

public interface MovieService extends BaseService<MovieEntity> {
    BaseResponse findMovieByCinemaId(int cinemaId);
    BaseResponse ShowTime(int movieId, int partDate);
    BaseResponse findByName(String name);


}
