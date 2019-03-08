package cinema.service.Impl;

import java.util.List;
import java.util.Optional;

import cinema.domain.Response.BaseResponse;
import cinema.domain.Response.GetArrayResponse;
import cinema.domain.Response.SingleItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cinema.domain.Requets.DeleteSearchRequest;
import cinema.domain.entities.CinemaEntity;
import cinema.domain.repo.CinemaRepo;
import cinema.service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService {

	@Autowired
    CinemaRepo cinemaRepo;

    @Override
    public BaseResponse SearchCinemaById(DeleteSearchRequest request) {
        SingleItemResponse<CinemaEntity> response = new SingleItemResponse<>();
        try {
            Optional<CinemaEntity> cinemaEntity = cinemaRepo.findById(request.getId());
            if(cinemaEntity != null){
                response.setSuccess(cinemaEntity.get());
            }
        }catch (Exception e){
            response.setFailed("err"+e);
        }
        return  null;
    }

    @Override
    public void save(CinemaEntity cinemaEntity) {
            if(cinemaEntity != null){
                cinemaRepo.save(cinemaEntity);
            }
    }
  
    @Override
    public BaseResponse findById(Integer id) {
        SingleItemResponse response = new SingleItemResponse();
        try{
            Optional<CinemaEntity> cinemaEntity = cinemaRepo.findById(id);
            if (cinemaEntity != null){
                response.setSuccess(cinemaEntity.get());
            }
        }catch (Exception e){
            response.setFailed("err"+e);
        }
        return response;
    }

	@Override
	public BaseResponse findAll() {
        GetArrayResponse<CinemaEntity> response = new GetArrayResponse<>();
        try{
            List<CinemaEntity> cinemaEntities = cinemaRepo.findAll();
            response.setSuccess(cinemaEntities);
        }catch (Exception e){
            response.setFailed();
        }
        return  response;
	}

	@Override
	public BaseResponse findByName(String name) {
        GetArrayResponse<CinemaEntity> response = new GetArrayResponse<>();
		try {
		    List<CinemaEntity> cinemaEntity = cinemaRepo.findByCinemaName(name);
			if(cinemaEntity != null){
                response.setSuccess(cinemaEntity);
            }
			
		} catch (Exception e) {
            response.setFailed();
		}
		return response;
	}

	
}
