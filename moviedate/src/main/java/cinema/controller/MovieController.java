package cinema.controller;

import cinema.domain.Response.BaseResponse;
import cinema.service.Impl.MovieServiceImpl;
import cinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    @GetMapping("/searchMovieIdByCinema")
    public BaseResponse searchMovieIdByCinema(@RequestParam("id") int CinemaId){
        return  movieService.findMovieByCinemaId(CinemaId);
    }

    @GetMapping("/showTime")
    public BaseResponse showTime(@RequestParam("movieId") int movieId,@RequestParam("partDate") int partDate){
        return  movieService.ShowTime(movieId,partDate);
    }

    @GetMapping("/searchCinemaName")
    public BaseResponse searchCinemaName(@RequestParam("name") String name){
        return  movieService.findByName(name);
    }

    @GetMapping("/showAllCinema")
    public BaseResponse showAllCinema(){
        return movieService.findAll();
    }

    @GetMapping("/searchMovieId")
    public BaseResponse searchMovieId(@RequestParam("movieId") int movieId){
        return  movieService.findMovieByCinemaId(movieId);
    }




}
