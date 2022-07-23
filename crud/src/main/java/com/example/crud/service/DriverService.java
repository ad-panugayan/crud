package com.example.crud.service;

import com.example.crud.infra.CarEntity;
import com.example.crud.infra.CarRepository;
import com.example.crud.infra.DriverEntity;
import com.example.crud.infra.DriverRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    private final DriverRepository driverRepo;
    private final CarRepository carRepository;

    @Autowired
    public DriverService(DriverRepository driverRepo, CarRepository carRepository) {
        this.driverRepo = driverRepo;
        this.carRepository = carRepository;
    }

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
            return driverRepo.save(driverEntity1);
        } else {
            throw new RuntimeException();
        }
    }

//    public DriverEntity addCar(Integer driverId, CarEntity carEntity) {
//        Optional<CarEntity> carEntityOptional = carRepository.findById(carEntity.getId());
//        Optional<DriverEntity> driverEntityOptional = driverRepo.findById(driverId);
//        if (carEntityOptional.isPresent() && driverEntityOptional.isPresent()) {
//            CarEntity car = carEntityOptional.get();
//            DriverEntity driverEntity = driverEntityOptional.get();
//            car.setDriverEntity(driverEntity);
//            carRepository.save(car);
//        }
//    }

    public void deleteDriver(Integer id) {
        driverRepo.deleteById(id);
    }

}
