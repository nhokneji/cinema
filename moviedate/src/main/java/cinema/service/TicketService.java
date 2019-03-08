package cinema.service;


import cinema.domain.Response.BaseResponse;
import cinema.domain.entities.TicketEntity;

public interface TicketService extends BaseService<TicketEntity> {
    BaseResponse findTicketByShowTimeId(int showtimeId);

}
