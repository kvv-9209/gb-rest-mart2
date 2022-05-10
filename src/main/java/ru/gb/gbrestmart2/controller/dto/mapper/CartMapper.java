package ru.gb.gbrestmart2.controller.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.gb.gbrestmart2.controller.dto.CartDto;
import ru.gb.gbrestmart2.entity.Cart;

@Mapper
public interface CartMapper {
    @Mapping(source = "cartId", target = "id")
    Cart toCart(CartDto cartDto);

    @Mapping(source = "id", target = "cartId")
    CartDto toCartDto(Cart cart);
}
