//package cinema.controller;
//
//import cinema.MainApplication;
//import cinema.service.Impl.CinemaServiceImpl;
//import org.json.simple.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
////@Configuration
////@ComponentScan(basePackages = { "cinema.service.Impl" })
//
//public class CinemaControllerHandler extends Handler {
//    @Autowired
//    CinemaServiceImpl cinemaService;
//
//    @Override
//    public String doProcessPost(JSONObject params, int accId) {
////        cinemaService = MainApplication.context.getBean("cinemaServiceImpl",CinemaServiceImpl.class);
//        return cinemaService.findAll().toString();
//    }
//}
