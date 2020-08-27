package com.jakuza.carrent.model.dto;

import java.util.Set;

import com.jakuza.carrent.model.RentAppUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RentAppUserDto {
    
    private Long id;
    
    private String firstName;
    
    private String lastName;

    private String passwd;

    private String email;
    
    private Set<String> phoneNumbers;

    public RentAppUserDto fromEntity(RentAppUser user){

        return RentAppUserDto.builder()
                    .id(user.getId())
                    .email(user.getEmail())
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .passwd(user.getPasswd())
                    .build();

    }

}