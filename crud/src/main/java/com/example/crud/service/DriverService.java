package com.example.crud.service;

import com.example.crud.infra.DriverEntity;
import com.example.crud.infra.DriverRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepo;

    public List<DriverEntity> getDrivers() {
        return driverRepo.findAll();
    }
}
