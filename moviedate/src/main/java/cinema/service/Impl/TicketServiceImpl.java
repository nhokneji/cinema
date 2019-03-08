package cinema.service.Impl;

import cinema.domain.Response.BaseResponse;
import cinema.domain.Response.GetArrayResponse;
import cinema.domain.Response.SingleItemResponse;
import cinema.domain.entities.TicketEntity;
import cinema.domain.repo.TicketRepo;
import cinema.service.BaseService;
import cinema.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepo ticketRepo;

    @Override
    public BaseResponse findTicketByShowTimeId(int showtimeId) {
        GetArrayResponse<TicketEntity> response = new GetArrayResponse<>();
        response.setSuccess(ticketRepo.findByShowtimeId(showtimeId));
        return response;
    }

    @Override
    public void save(TicketEntity ticketEntity) {
        ticketRepo.save(ticketEntity);
    }

    @Override
    public BaseResponse findAll() {
        GetArrayResponse<TicketEntity> response = new GetArrayResponse<>();
        try{
            List<TicketEntity> ticketEntities = ticketRepo.findAll();
            if(ticketEntities != null){
                response.setSuccess(ticketEntities);
            }
        }catch (Exception e){
            response.setFailed();
        }

        return response;
    }

    @Override
    public BaseResponse findById(Integer id) {
        SingleItemResponse<TicketEntity> response = new SingleItemResponse<>();
        try {
            Optional<TicketEntity> ticketEntity = ticketRepo.findById(id);
            if(ticketEntity != null){
                response.setSuccess(ticketEntity.get());
            }
        }catch (Exception e){
            response.setFailed();
        }
        return response;
    }
}
