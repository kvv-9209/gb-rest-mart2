package ru.gb.gbrestmart2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gb.gbrestmart2.controller.dto.CartDto;
import ru.gb.gbrestmart2.controller.dto.ManufacturerDto;

@FeignClient(url = "localhost:45733/cart", value = "cartGateway")
public interface CartGateway {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto newCart(@RequestBody CartDto cartDto);
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto delCart(@RequestBody CartDto cartDto);
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto addProduct(@RequestBody CartDto cartDto);
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto delProduct(@RequestBody CartDto cartDto);

}
