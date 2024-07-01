package com.example.demo.converter;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity convertDTOtoEntity(UserDTO userDTO)  {
        UserEntity userEntity =new UserEntity();
        userEntity.setEmail(userDTO.getOwnerEmail());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setName(userDTO.getOwnerName());



        return userEntity;
    }

    public UserDTO convertEntityToDTO(UserEntity userEntity)  {
        UserDTO userDTO =new UserDTO();
        userDTO.setOwnerEmail(userEntity.getEmail());
        userDTO.setPhone(userEntity.getPhone());
//        userDTO.setPassword(userEntity.getPassword());
        userDTO.setOwnerName(userEntity.getName());
        userDTO.setId(userEntity.getId());



        return userDTO;
    }
}
