package ru.gb.gbrestmart2.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ManufacturerDto {

    @JsonProperty(value = "id")
    private Long manufacturerId;
    private String name;
//    private List<String> products;
}
