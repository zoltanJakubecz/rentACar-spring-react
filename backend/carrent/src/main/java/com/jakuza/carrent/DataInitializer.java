package com.jakuza.carrent;


import java.time.LocalDateTime;

import com.jakuza.carrent.model.Address;
import com.jakuza.carrent.model.Car;
import com.jakuza.carrent.model.Customer;
import com.jakuza.carrent.repository.AddressRepository;
import com.jakuza.carrent.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;


    @Autowired
    private AddressRepository addressRepository;

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

        Customer customer1 = Customer.builder()
                    .firstName("Zotyi")
                    .lastName("Motyi")
                    .phoneNumber("777-6666")
                    .added(LocalDateTime.now())
                    .build();

                    Customer customer2 = Customer.builder()
                    .firstName("Elemer")
                    .lastName("Lapos")
                    .phoneNumber("999-6666")
                    .added(LocalDateTime.now())
                    .build();

                    Address address1 = Address.builder()
                    .country("Hungary")
                    .city("Gyula")
                    .street("Ady")
                    .customer(customer1)
                    .customer(customer2)
                    .build();

        customer1.setAddress(address1);
        customer2.setAddress(address1);
        
        addressRepository.save(address1);

    }
    
}