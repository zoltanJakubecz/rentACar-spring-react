package com.jakuza.carrent.repository;

import com.jakuza.carrent.model.Rental;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalReposirory extends JpaRepository<Rental, Long> {
    
}