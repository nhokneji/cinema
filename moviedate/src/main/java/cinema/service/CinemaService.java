package cinema.service;

import cinema.domain.Requets.DeleteSearchRequest;
import cinema.domain.Response.BaseResponse;
import cinema.domain.entities.CinemaEntity;


public interface CinemaService extends BaseService<CinemaEntity> {
    BaseResponse SearchCinemaById(DeleteSearchRequest request);

    //	BaseResponse login()
//    BaseResponse CreateCinema();
    BaseResponse findByName(String name);
}
