package com.jakuza.carrent.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RentAppUser {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String firstName;
    
    private String lastName;

    @ManyToOne
    private Address address;

    @OneToMany(mappedBy = "user")
    private Set<Rental> rentals;

    private String eMail;
    
    @ElementCollection
    @Singular
    private List<String> phoneNumbers;

    @Column(nullable = false)
    private LocalDateTime added;
}