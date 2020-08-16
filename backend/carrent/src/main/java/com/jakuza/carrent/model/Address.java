package com.jakuza.carrent.model;

import java.util.Set;

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
    private Set<Customer> customers;
    
    String street;
    String houseName;
}
