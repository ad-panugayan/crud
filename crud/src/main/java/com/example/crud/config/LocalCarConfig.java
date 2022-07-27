package com.example.crud.config;

import com.example.crud.service.CarService;
import com.example.crud.service.LocalCarServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Slf4j
@Configuration
public class LocalCarConfig {

    @Bean
    public CarService localCarService() {
        log.info("Local car service");
        return new LocalCarServiceImpl();
    }

}
