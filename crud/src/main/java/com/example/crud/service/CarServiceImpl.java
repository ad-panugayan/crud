package com.example.crud.service;

import com.example.crud.infra.CarEntity;
import com.example.crud.infra.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<CarEntity> getCars() {
        return carRepository.findAll();
    }

}
