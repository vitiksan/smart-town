package com.smarttown.aggregator.controllers.electricity;

import com.smarttown.aggregator.entities.electricity.ElectricityMeterFaker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.Duration;

import reactor.core.publisher.Flux;

@RestController
public class ElectricityController {


    @GetMapping(value = "/smart-town/electricity/flux", produces = "application/stream+json")
    public Flux<ElectricityMeterFaker> streamJsonObjects() {
        return Flux.interval(Duration.ofSeconds(1)).map(i -> new ElectricityMeterFaker());
    }

}
