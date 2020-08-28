package com.jakuza.carrent.controller;

import java.util.List;

import com.jakuza.carrent.model.dto.RentAppUserDto;
import com.jakuza.carrent.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    public ResponseEntity<List<RentAppUserDto>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }
}