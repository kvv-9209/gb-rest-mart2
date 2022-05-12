package ru.gb.cartproduct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

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
