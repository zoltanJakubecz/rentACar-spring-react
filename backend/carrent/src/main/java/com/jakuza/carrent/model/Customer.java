package com.jakuza.carrent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Customer {
    
    @Id
    @GeneratedValue
    Long id;
    
    String firstName;
    
    String lastName;

    @ManyToOne
    Address address;

    String eMail;
    
    String phoneNumber;
}