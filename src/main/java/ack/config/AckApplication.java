package ack.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class AckApplication extends SpringBootServletInitializer {
        public static void main(String[] args) {
            SpringApplication.run(AckApplication.class, args);
        }
}
