package com.jakuza.carrent.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rental {
    
    @Id
    @GeneratedValue
    private Long id;

    private Long car_id;
    
    private Long user_id;

    @Column(nullable = false)
    private LocalDateTime rentFrom;

    @Column(nullable = false)
    private LocalDateTime rentTo;

    private LocalDateTime added;
    
    
}