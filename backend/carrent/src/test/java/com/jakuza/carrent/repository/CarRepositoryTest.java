package com.jakuza.carrent.repository;

import java.time.LocalDateTime;

import com.jakuza.carrent.model.Car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@ActiveProfiles("test")
public class CarRepositoryTest {
    
    @Autowired
    private CarRepository carRepository;

    @BeforeEach
    public void init(){

        carRepository.save(Car.builder()
            .brand("Trabant")
            .model("601")
            .regPlate("ZOZ-531")
            .active(true)
            .added(LocalDateTime.now())
            .build());

        carRepository.save(Car.builder()
            .brand("NSU")
            .model("601")
            .regPlate("ZOZ-531")
            .active(true)
            .added(LocalDateTime.now())
            .build());

        carRepository.save(Car.builder()
            .brand("BMW")
            .model("601")
            .regPlate("ZOZ-531")
            .active(true)
            .added(LocalDateTime.now())
            .build());

    }

    @Test
    public void initTest() {
        assertThat(carRepository).isNotNull();
        assertThat(carRepository.findAll()).hasSize(3);
    }

    @Test
    public void saveNewCar(){
        Car car1 = carRepository.save(
                    Car.builder()
                            .brand("Opel")
                            .model("Mokka")
                            .regPlate("PPP-999")
                            .build()
                    );   
        assertThat(carRepository.findAll()).contains(car1);                        
    }

    @Test
    public void getAllCars(){
        assertThat(carRepository.findAll()).hasSize(3);
    }

    

}