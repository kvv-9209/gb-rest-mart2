package ru.gb.gbrestmart2.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.gbrestmart2.controller.dto.CartDto;
import ru.gb.gbrestmart2.controller.dto.ManufacturerDto;
import ru.gb.gbrestmart2.service.CartGateway;
import ru.gb.gbrestmart2.service.ManufacturerApi;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

    private final CartGateway cartGateway;

    @GetMapping
    public CartDto newCart() {
        return cartGateway.newCart(new CartDto());
    }
    @GetMapping
    public CartDto delCart() {
        return cartGateway.newCart(new CartDto());
    }
    @GetMapping
    public CartDto newProduct() {
        return cartGateway.newCart(new CartDto());
    }
    @GetMapping
    public CartDto delProduct() {
        return cartGateway.newCart(new CartDto());
    }
}
