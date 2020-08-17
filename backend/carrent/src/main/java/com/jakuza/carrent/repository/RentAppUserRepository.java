package com.jakuza.carrent.repository;

import com.jakuza.carrent.model.RentAppUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RentAppUserRepository extends JpaRepository<RentAppUser, Long> {
    
}