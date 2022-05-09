package ru.gb.gbrestmart2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gb.gbrestmart2.controller.dto.ManufacturerDto;

@FeignClient(url = "localhost:45732/manufacturer", value = "manufacturerGateway")
public interface ManufacturerGateway {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    ManufacturerDto create(@RequestBody ManufacturerDto manufacturerDto);
}
