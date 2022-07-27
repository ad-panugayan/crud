package com.example.crud.config;

import com.example.crud.infra.CarRepository;
import com.example.crud.service.CarService;
import com.example.crud.service.CarServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Slf4j
@Configuration
public class ProductionCarConfig {

    @Primary
    @Bean
    public CarService defaultCarService(CarRepository carRepository) {
        log.info("Prod car service");
        return new CarServiceImpl(carRepository);
    }

}
