package com.jakuza.carrent.service;

import java.time.LocalDateTime;
import java.util.List;

import com.jakuza.carrent.model.Car;
import com.jakuza.carrent.model.dto.CarDto;
import com.jakuza.carrent.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public List<Car> getCars(){
        return carRepository.findAll();
    }

	public Car addCar(CarDto car) {
        Car newCar = Car.builder()
            .brand(car.getBrand())
            .model(car.getModel())
            .regPlate(car.getRegPlate())
            .added(LocalDateTime.now())
            .build();
        return carRepository.save(newCar);
	}

}