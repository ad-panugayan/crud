package com.example.crud.controller;

import com.example.crud.infra.DriverEntity;
import com.example.crud.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {
    @Autowired
    private DriverService driverService;

    @GetMapping(path = "/drivers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DriverEntity>> getDrivers() {
        return ResponseEntity.ok(driverService.getDrivers());
    }

    @PostMapping(path = "/drivers", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DriverEntity> createDriver(@RequestBody DriverEntity driverEntity) {
        return ResponseEntity.ok(driverService.createDriver(driverEntity));
    }

    @PutMapping(path = "/drivers/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DriverEntity> updateDriver(@PathVariable Integer id, @RequestBody DriverEntity driverEntity) {
        return ResponseEntity.ok(driverService.updateDriver(id, driverEntity));
    }

    @DeleteMapping(path = "/drivers/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> deleteDriver(@PathVariable Integer id) {
        driverService.deleteDriver(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
