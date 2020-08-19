package com.jakuza.carrent.controller;

import java.util.List;

import com.jakuza.carrent.model.Car;
import com.jakuza.carrent.model.dto.CarDto;
import com.jakuza.carrent.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping
    public List<CarDto> getCars(){
        return carService.getCars();
    }

    @PostMapping
    public Car addCar(@RequestBody CarDto car){
        return carService.addCar(car);
    }

    @GetMapping("/{carId}")
    public CarDto getCar(@PathVariable Long carId){
        return carService.getCar(carId);
    }

    @PutMapping("/{carId")
    public CarDto updateCar(@PathVariable Long carId, @RequestBody CarDto car){
        return carService.updateCar(carId, car);
    }

}