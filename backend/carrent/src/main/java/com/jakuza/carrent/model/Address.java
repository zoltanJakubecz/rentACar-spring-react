package com.jakuza.carrent.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String country;
    private String city;
    
    @Singular
    @OneToMany(mappedBy = "address")
    @EqualsAndHashCode.Exclude
    private Set<RentAppUser> rentAppUsers;
    
    private String street;
    private String houseName;
    private String houseNumber;
    private String zipCode;
}
