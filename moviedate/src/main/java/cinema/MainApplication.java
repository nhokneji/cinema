package cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class MainApplication {
//    public static ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	public static void main(String[] args) throws IOException {
       Starter st  =new Starter();
       st.start();
        SpringApplication.run(MainApplication.class, args);


    }


}
