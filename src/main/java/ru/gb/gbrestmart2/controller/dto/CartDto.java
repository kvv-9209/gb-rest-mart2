package ru.gb.gbrestmart2.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import ru.gb.gbrestmart2.entity.enums.Status;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartDto {

    @JsonProperty(value = "id")
    private Long cartId;
    private Status status;

}
