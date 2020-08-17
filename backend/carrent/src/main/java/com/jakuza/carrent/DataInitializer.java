package com.jakuza.carrent;


import java.time.LocalDateTime;

import com.jakuza.carrent.model.Address;
import com.jakuza.carrent.model.Car;
import com.jakuza.carrent.model.RentAppUser;
import com.jakuza.carrent.repository.AddressRepository;
import com.jakuza.carrent.repository.CarRepository;
import com.jakuza.carrent.repository.RentAppUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;


    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private RentAppUserRepository cusRepo;

    @Override
    public void run(String... args) throws Exception {

        Car trabant = Car.builder()
            .brand("Trabant")
            .model("601")
            .regPlate("ZOZ-531")
            .active(true)
            .added(LocalDateTime.now())
            .build();

        Car bmw = Car.builder()
            .brand("BMW")
            .model("330i")
            .regPlate("ZOL-531")
            .active(true)
            .added(LocalDateTime.now())
            .build();

        carRepository.save(trabant);
        carRepository.save(bmw);

        RentAppUser rentAppUser1 = RentAppUser.builder()
                    .firstName("Zotyi")
                    .lastName("Motyi")
                    .phoneNumber("777-6666")
                    .added(LocalDateTime.now())
                    .build();

        RentAppUser rentAppUser2 = RentAppUser.builder()
                    .firstName("Elemer")
                    .lastName("Lapos")
                    .phoneNumber("999-6666")
                    .added(LocalDateTime.now())
                    .build();

        Address address1 = Address.builder()
                    .country("Hungary")
                    .city("Gyula")
                    .street("Ady")
                    .rentAppUser(rentAppUser1)
                    .rentAppUser(rentAppUser2)
                    .build();

        rentAppUser1.setAddress(address1);
        rentAppUser2.setAddress(address1);

        
        
        addressRepository.save(address1);
        cusRepo.save(rentAppUser1);
        cusRepo.save(rentAppUser2);

    }
    
}