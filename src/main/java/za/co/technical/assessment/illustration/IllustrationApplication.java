package za.co.technical.assessment.illustration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.co.technical.assessment.illustration.service.impl.DefaultIPLocationService;

import java.io.IOException;


@SpringBootApplication
public class  IllustrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(IllustrationApplication.class, args);
        DefaultIPLocationService defaultIPLocationService = new DefaultIPLocationService();
        try {
            defaultIPLocationService.getLocation("206.190.36.45");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
