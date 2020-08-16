package com.jakuza.carrent;

import com.jakuza.carrent.model.Car;
import com.jakuza.carrent.model.dto.CarDto;
import com.jakuza.carrent.service.CarService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

public class CarServiceTest {

    @Autowired
    private CarService carService;

    @MockBean
    private Car car;


    @Test
    public void addCar(){
        CarDto newCar = com.jakuza.carrent.model.dto.CarDto.builder().brand("brand").model("model").regPlate("regPlate").build();

    }
    
}