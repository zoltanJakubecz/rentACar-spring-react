package com.jakuza.carrent;


import java.time.LocalDateTime;

import com.jakuza.carrent.model.Address;
import com.jakuza.carrent.model.Car;
import com.jakuza.carrent.model.RentAppUser;
import com.jakuza.carrent.model.Rental;
import com.jakuza.carrent.repository.AddressRepository;
import com.jakuza.carrent.repository.CarRepository;
import com.jakuza.carrent.repository.RentAppUserRepository;
import com.jakuza.carrent.repository.RentalReposirory;

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

    @Autowired
    private RentalReposirory rentRepo;

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
            .email("kakadu@kukadu.com")
            .added(LocalDateTime.now())
            .build();

        RentAppUser rentAppUser2 = RentAppUser.builder()
            .firstName("Elemer")
            .lastName("Lapos")
            .email("zulu@kakker.hu")
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


        Rental rent = Rental.builder()
            .car_id(2L)
            .user_id(4L)
            .rentFrom(LocalDateTime.of(2020, 1, 18, 10, 0))
            .rentTo(LocalDateTime.of(2020, 1, 19, 10, 0))
            .added(LocalDateTime.now())
            .build();

        rentRepo.save(rent);


    }
    
}