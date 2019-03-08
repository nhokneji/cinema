//package cinema;
//
//import cinema.controller.CinemaControllerHandler;
//import cinema.domain.repo.CinemaRepo;
//import com.sun.net.httpserver.HttpServer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.io.IOException;
//import java.net.InetSocketAddress;
//
//@Component
//public class Starter{
//
//    @Autowired
//    CinemaControllerHandler cinemaControllerHandler;
//
//
//
//
//    public void start() throws IOException {
//        HttpServer server;
//        try {
//            server = HttpServer.create(new InetSocketAddress(9000), 0);
//            server.createContext("/searchAllCinema", cinemaControllerHandler);
//            server.start();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}


