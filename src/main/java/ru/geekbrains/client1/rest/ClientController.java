package ru.geekbrains.client1.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.geekbrains.api.controllers.ProductApi;
import ru.geekbrains.api.model.ProductDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {

    @Value("${user.role}")
    private String role;

    private final ProductApi productApi;

    @GetMapping(
            value = "/role",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public String getRole() {
        return String.format("Role the app is %s", role);
    }

    @GetMapping("/feign-products")
    List<ProductDto> getProductsFromFeign() {
        return productApi.getAll();
    }
}
