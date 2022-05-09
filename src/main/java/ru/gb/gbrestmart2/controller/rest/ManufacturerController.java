package ru.gb.gbrestmart2.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbrestmart2.controller.dto.ManufacturerDto;
import ru.gb.gbrestmart2.service.ManufacturerApi;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/manufacturer")
public class ManufacturerController {

//    private final ManufacturerGateway manufacturerGateway;
    private final ManufacturerApi manufacturerApi;
    @GetMapping
    public ManufacturerDto create() {
        return manufacturerApi.create(new ManufacturerDto());
    }
}
