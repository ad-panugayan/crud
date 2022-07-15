package com.example.crud.controller;

import com.example.crud.infra.DriverEntity;
import com.example.crud.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {
    @Autowired
    private DriverService driverService;

    @GetMapping(path = "/drivers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DriverEntity>> getDrivers() {
        return ResponseEntity.ok(driverService.getDrivers());
    }

}
