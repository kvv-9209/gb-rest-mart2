package ru.gb.cartproduct;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/cart")
public class CartController {


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto newCart(@RequestBody CartDto cartDto) {
        return CartDto.builder().cartId(1L).status(Status.ACTIVE).build();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto delCart(@RequestBody CartDto cartDto) {
        return null;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto addProduct(@RequestBody CartDto cartDto) {
        return null;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto delProduct(@RequestBody CartDto cartDto) {
        return null;
    }
}
