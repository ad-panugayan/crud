package com.example.crud.controller;

import com.example.crud.infra.CarEntity;
import com.example.crud.service.CarService;
import com.example.crud.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    private CarController(@Qualifier("localCarService") CarService carService) {
        this.carService = carService;
    }

    @GetMapping(path = "/cars", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CarEntity>> getCars() {
        return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
    }

}
