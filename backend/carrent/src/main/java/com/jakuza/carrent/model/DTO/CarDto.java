package com.jakuza.carrent.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDto {

    private String brand;
    
    private String model;
    
    private String regPlate;

    private String image;
    
}
