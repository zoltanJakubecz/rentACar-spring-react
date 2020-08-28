package com.jakuza.carrent.service;

import java.util.List;
import java.util.stream.Collectors;

import com.jakuza.carrent.model.dto.RentAppUserDto;
import com.jakuza.carrent.repository.RentAppUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    RentAppUserRepository userRepository;

	public List<RentAppUserDto> getUsers() {
		return userRepository.findAll().stream().map(RentAppUserDto::fromEntity).collect(Collectors.toList());
	}
    
}