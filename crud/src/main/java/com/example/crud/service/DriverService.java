package com.example.crud.service;

import com.example.crud.infra.DriverEntity;
import com.example.crud.infra.DriverRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepo;

    public List<DriverEntity> getDrivers() {
        return driverRepo.findAll();
    }

    public DriverEntity createDriver(DriverEntity driverEntity) {
        return driverRepo.save(driverEntity);
    }

    public DriverEntity updateDriver(Integer id, DriverEntity driverEntity) {
        Optional<DriverEntity> driverEntityOptional = driverRepo.findById(id);
        if (driverEntityOptional.isPresent()) {
            DriverEntity driverEntity1 = driverEntityOptional.get();
            driverEntity1.setName(driverEntity.getName());
            driverEntity1.setCarId(driverEntity.getCarId());
            return driverRepo.save(driverEntity1);
        } else {
            throw new RuntimeException();
        }
    }

    public void deleteDriver(Integer id) {
        driverRepo.deleteById(id);
    }
}
