package com.example.crud.service;

import com.example.crud.infra.CarEntity;

import java.util.List;

public interface CarService {
    List<CarEntity> getCars();
}
