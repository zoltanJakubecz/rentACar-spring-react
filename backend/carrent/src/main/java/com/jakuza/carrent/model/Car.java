package com.jakuza.carrent.model;

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
    
    String brand;
    
    String model;
    
    String regPlate;
    
    boolean active;
}