package com.jakuza.carrent.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Entity
@AllArgsConstructor
@Data
@Builder
public class Address {

    @Id
    @GeneratedValue
    Long id;
    String country;
    String city;
    
    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    @Singular
    private final List<Customer> customers = new ArrayList<>();
    
    String street;
    String houseName;
}
