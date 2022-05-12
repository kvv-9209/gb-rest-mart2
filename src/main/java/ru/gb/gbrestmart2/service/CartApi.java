//package ru.gb.gbrestmart2.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.client.RestTemplate;
//import ru.gb.gbrestmart2.controller.dto.CartDto;
//import ru.gb.gbrestmart2.controller.dto.ManufacturerDto;
//
//import java.net.URI;
//
//@Component
//public class CartApi {
//
//    public static final String URL = "http://localhost:45733/cart";
//
//    private final RestTemplate restTemplate;
//
//    @Autowired
//    public CartApi(RestTemplateBuilder restTemplateBuilder) {
//        this.restTemplate = restTemplateBuilder.build();
//    }
//
//    public CartDto newCart(CartDto cartDto) {
//        return restTemplate.postForObject(URI.create(URL), cartDto, CartDto.class);
//    }
//
//    public CartDto delCart(CartDto cartDto) {
//        return restTemplate.postForObject(URI.create(URL), cartDto, CartDto.class);
//    }
//
//    public CartDto addProduct(CartDto cartDto) {
//        return restTemplate.postForObject(URI.create(URL), cartDto, CartDto.class);
//    }
//
//    public CartDto delProduct(CartDto cartDto) {
//        return restTemplate.postForObject(URI.create(URL), cartDto, CartDto.class);
//    }
//}
