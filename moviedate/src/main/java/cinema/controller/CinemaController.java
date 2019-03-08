package cinema.controller;

import cinema.domain.Requets.DeleteSearchRequest;
import cinema.domain.Response.BaseResponse;
import cinema.domain.entities.CinemaEntity;
import cinema.service.Impl.CinemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinema")
public class CinemaController {
    @Autowired
    CinemaServiceImpl cinemaService;

    @PostMapping("/searchAllCinema")
    public BaseResponse searchAllCinema(){
        return  cinemaService.findAll();
    }

    @PostMapping("/searchCinema")
    public BaseResponse SearchCinemaById(@RequestBody DeleteSearchRequest request) {
        return cinemaService.findById(request.getId());
    }

//    @PostMapping("/searchCinema")
//    public BaseResponse SearchCinemaById(@RequestParam("id") int id) {
//        return cinemaService.findById(id);
//    }

    @GetMapping("/cinemaName")
    public BaseResponse findByCinemaName(@RequestParam("name") String name){
        return cinemaService.findByName(name);
    }

}
