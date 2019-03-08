package cinema.controller;


import cinema.domain.Response.BaseResponse;
import cinema.service.Impl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("/searchTicketByShowtime")
    public BaseResponse searchTicketByShowTimeId(@RequestParam("id") int ticketId){
        return  ticketService.findTicketByShowTimeId(ticketId);
    }

    @GetMapping("/searchTichketId")
    public BaseResponse searchTicketById(@RequestParam("id") int ticketId){
        return  ticketService.findById(ticketId);
    }


    @GetMapping("/searchAll")
    public BaseResponse searchAll(){
        return  ticketService.findAll();
    }


}
