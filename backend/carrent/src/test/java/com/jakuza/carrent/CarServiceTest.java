package com.jakuza.carrent;

import com.jakuza.carrent.model.dto.CarDto;
import com.jakuza.carrent.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;

public class CarServiceTest {

    @Autowired
    private CarService carService;


    public void addCar(){
        CarDto newCar = com.jakuza.carrent.model.dto.CarDto.builder().brand("brand").model("model").regPlate("regPlate").build();
    }
    
}