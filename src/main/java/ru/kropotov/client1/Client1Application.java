package ru.kropotov.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import ru.kropotov.client1.api.controllers.ProductApi;

@SpringBootApplication
@EnableFeignClients(clients = {ProductApi.class})
public class Client1Application {

    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }

}
