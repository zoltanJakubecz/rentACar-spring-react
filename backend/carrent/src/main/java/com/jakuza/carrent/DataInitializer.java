package com.jakuza.carrent;


import java.time.LocalDateTime;

import com.jakuza.carrent.model.Car;
import com.jakuza.carrent.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        Car car = Car.builder()
            .brand("Trabant")
            .model("601")
            .regPlate("ZOZ-531")
            .active(true)
            .added(LocalDateTime.now())
            .build();

        carRepository.save(car);
    }
    
}