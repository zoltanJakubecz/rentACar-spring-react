package com.jakuza.carrent.model.dto;

import com.jakuza.carrent.model.Car;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDto {

    private Long id;

    private String brand;
    
    private String model;
    
    private String regPlate;

    private String image;

    public static CarDto fromEntity(Car car){
        return CarDto.builder()
            .id(car.getId())
            .brand(car.getBrand())
            .model(car.getModel())
            .regPlate(car.getRegPlate())
            .image(car.getImage())
            .build();
    }
    
}
