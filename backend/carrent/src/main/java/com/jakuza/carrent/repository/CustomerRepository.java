package com.jakuza.carrent.repository;

import com.jakuza.carrent.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}