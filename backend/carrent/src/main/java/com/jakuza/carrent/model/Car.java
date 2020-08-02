package com.jakuza.carrent.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Car {
    
    @Id
    @GeneratedValue
    Long id;
    
    private String brand;
    
    private String model;
    
    private String regPlate;
    
    private boolean active;

    private LocalDateTime added;
    
}