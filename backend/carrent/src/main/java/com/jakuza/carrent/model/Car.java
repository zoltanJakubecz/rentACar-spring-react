package com.jakuza.carrent.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
    private Long id;
    
    private String brand;
    
    private String model;
    
    private String regPlate;

    private String image;
    
    private boolean active;

    private LocalDateTime added;

    @OneToMany(mappedBy = "car")
    private Set<Rental> rentals;
    
}